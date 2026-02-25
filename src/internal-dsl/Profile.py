from Models import Metadata, UserData, Experience, Projects, Education, Skills, Interests, Languages


class Profile:
    def __init__(self, name):
        self.name = name
        self.metadata = None
        self.userdata = None
        self.sections = []

    def with_metadata(self, style, font, imgPath):
        self.metadata = Metadata(style, font, imgPath)
        return self

    def with_userdata(self, name, email, telephone, direction, country, city):
        self.userdata = UserData(name, email, telephone, direction, country, city)
        return self

    def add_experience(self, language):
        section = Experience(language, self)
        self.sections.append(section)
        return section

    def add_projects(self, language):
        section = Projects(language, self)
        self.sections.append(section)
        return section

    def add_education(self, language):
        section = Education(language, self)
        self.sections.append(section)
        return section

    def add_skills(self, language):
        section = Skills(language, self)
        self.sections.append(section)
        return section

    def add_interests(self, language):
        section = Interests(language, self)
        self.sections.append(section)
        return section

    def add_languages(self, language):
        section = Languages(language, self)
        self.sections.append(section)
        return section

    def build(self):
        # Aplicar filtros automáticamente si se definió un Customization
        if self.customizer:
            self.customizer.apply_filters()

        print(f"==========================================")
        print(f"CV DE: {self.userdata.name if self.userdata else self.name}")
        print(f"==========================================")
        print(f"User Data: {self.userdata.email if self.userdata else 'N/A'} | {self.userdata.telephone if self.userdata else 'N/A'} | {self.userdata.direction if self.userdata else 'N/A'}, {self.userdata.city if self.userdata else 'N/A'}, {self.userdata.country if self.userdata else 'N/A'}")
        print(f"==========================================")
        
        for section in self.sections:
            tipo = section.section_type
            print(f"\n--- SECCIÓN: {tipo} ({section.language}) ---")
            
            # Lógica para imprimir cada tipo de objeto
            if isinstance(section, Experience):
                for job in section.jobs:
                    print(f"  * {job.title} en {job.company} ({job.start_date} - {job.end_date})")
            
            elif isinstance(section, Education):
                for degree in section.degrees: # Antes esto faltaba
                    print(f"  * {degree.title} en {degree.institution} ({degree.graduation_date})")
            
            elif isinstance(section, Projects):
                for p in section.projects:
                    print(f"  * {p.title} (Link: {p.link})")
            
            elif isinstance(section, Skills):
                for skill in section.skills:
                    print(f"  * {skill.title}: {', '.join(skill.attributes)}")

            elif isinstance(section, Interests):
                for interest in section.values:
                    print(f"  * {interest}")
            
            elif isinstance(section, Languages):
                for language in section.values:
                    print(f"  * {language}")
                    
        print(f"\n==========================================")
        return self