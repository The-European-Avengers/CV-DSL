class Metadata:
    def __init__(self, style: str, font: str, img_path: str):
        self.style = style
        self.font = font
        self.img_path = img_path

class UserData:
    def __init__(self, name, email, telephone, direction, country, city):
        self.name = name
        self.email = email
        self.telephone = telephone
        self.direction = direction
        self.country = country
        self.city = city

class Job:
    def __init__(self, title, company, start_date, end_date, description, tags):
        self.title = title
        self.company = company
        self.start_date = start_date
        self.end_date = end_date
        self.description = description 
        self.tags = tags    

class Project:
    def __init__(self, title, link, description, technologies, tags):
        self.title = title
        self.link = link
        self.description = description
        self.technologies = technologies
        self.tags = tags

class Degree:
    def __init__(self, title, institution, graduation_date, country, tags):
        self.title = title
        self.institution = institution
        self.graduation_date = graduation_date
        self.country = country
        self.tags = tags

class Skill:
    def __init__(self, title, attributes):
        self.title = title
        self.attributes = attributes


class Section:
    def __init__(self, language, parent):
        self.language = language
        self.parent = parent

    def end_section(self):
        return self.parent

class Experience(Section):
    def __init__(self, language, parent):
        super().__init__(language, parent)
        self.jobs = []
        self.section_type = "Experience"

    def add_job(self, title, company, start_date, end_date, description=None, tags=None):
        new_job = Job(title, company, start_date, end_date, description or [], tags or [])
        self.jobs.append(new_job)
        return self

class Projects(Section):
    def __init__(self, language, parent):
        super().__init__(language, parent)
        self.projects = []
        self.section_type = "Projects"
    
    def add_project(self, title, link, description=None, technologies=None, tags=None):
        new_project = Project(title, link, description or [], technologies or [], tags or [])
        self.projects.append(new_project)
        return self

class Education(Section):
    def __init__(self, language, parent):
        super().__init__(language, parent)
        self.degrees = []
        self.section_type = "Education"

    def add_degree(self, title, institution, graduation_date, country, tags=None):
        new_degree = Degree(title, institution, graduation_date, country, tags or [])
        self.degrees.append(new_degree)
        return self

class Skills(Section):
    def __init__(self, language, parent):
        super().__init__(language, parent)
        self.skills = []
        self.section_type = "Skills"

    def add_skill(self, title, attributes):
        self.skills.append(Skill(title, attributes))
        return self

class Interests(Section):
    def __init__(self, language, parent):
        super().__init__(language, parent)
        self.values = []
        self.section_type = "Interests"

    def add_interests(self, values: list):
        self.values.extend(values)
        return self

class Languages(Section):
    def __init__(self, language, parent):
        super().__init__(language, parent)
        self.values = []
        self.section_type = "Languages"

    def add_languages(self, values: list):
        self.values.extend(values)
        return self