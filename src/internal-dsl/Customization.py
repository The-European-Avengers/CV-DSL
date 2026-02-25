class Customization:
    def __init__(self, profile):
        self.profile = profile
        self.filters = []
        self.profile.customizer = self # Vinculación automática

    def add_filter(self, section_name, filter_type, value):
        self.filters.append({'section': section_name, 'type': filter_type, 'value': value})
        return self
    
    def apply_filters(self):
        # 1. Determinar qué secciones incluir (Inclusión explícita)
        included_names = {f['section'] for f in self.filters}
        
        # 2. Filtrar por secciones deseadas e idioma
        lang_filters = [f['value'] for f in self.filters if f['type'] == "LANGUAGE"]
        
        self.profile.sections = [
            s for s in self.profile.sections 
            if s.section_type in included_names and (not lang_filters or s.language in lang_filters)
        ]

        # 3. Filtrar contenido interno (Tags)
        for f in [f for f in self.filters if f['type'] == "TAGS"]:
            for section in self.profile.sections:
                if section.section_type == f['section']:
                    if hasattr(section, "jobs"):
                        section.jobs = [j for j in section.jobs if f['value'] in j.tags]
                    elif hasattr(section, "projects"):
                        section.projects = [p for p in section.projects if f['value'] in p.tags]
                    elif hasattr(section, "degrees"):
                        section.degrees = [d for d in section.degrees if f['value'] in d.tags]
                    elif hasattr(section, "skills"):
                        # Filtrar skills por title (case insensitive)
                        section.skills = [s for s in section.skills if s.title.upper() == f['value'].upper()]
                    elif hasattr(section, "values"):
                        # Filtrar interests/languages por valores (case insensitive)
                        section.values = [v for v in section.values if v.upper() == f['value'].upper()]

        