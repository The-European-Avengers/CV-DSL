from Profile import Profile
from Customization import Customization

# 1. Definición completa del Perfil (Estado inicial con todos los datos)
my_cv = Profile("Lucas Gonzalez CV") \
    .with_metadata(
        style="Academic", 
        font="Times New Roman", 
        imgPath="~/Documents/Images/ProfilePicture.jpg"
    ) \
    .with_userdata(
        name="Lucas Gonzalez", 
        email="lucasgonz@gmail.com", 
        telephone="+45 600000000",
        direction="Østergade 1", 
        country="Denmark", 
        city="Odense"
    ) \
    .add_experience(language="EN") \
        .add_job("Software Engineer", "Google", "02-2020", "01-2022", ["Implemented an internal tool for analyitics"], ["CLOUD", "JAVA", "DEVELOPER"]) \
    .end_section() \
    .add_experience(language="ES") \
        .add_job("Ingeniero de Software", "Google", "02-2020", "01-2022", ["Implementé una herramienta interna para análisis"], ["CLOUD", "JAVA", "DESARROLLADOR"]) \
    .end_section() \
    .add_projects(language="EN") \
        .add_project("REST API", "https://link.com", ["Implemented a REST API for a shooping e-commerce"], ["Node.js", "Express"], ["WEB", "BACKEND"]) \
        .add_project("Pizza Web", "https://link2.com", ["Implemented a UI for a pizza restaurant"], ["Next.js", "React"], ["WEB", "FRONTEND"]) \
        .add_project("Mobile App", "https://link3.com", ["Implemented a mobile app for a restaurant"], ["React Native"], ["MOBILE", "FRONTEND"]) \
    .end_section() \
    .add_education(language="EN") \
        .add_degree("Master in Software Engineering", "SDU", "2018", "Denmark", ["MASTER", "UNIVERSITY"]) \
    .end_section() \
    .add_skills(language="EN") \
        .add_skill("Frontend", ["React", "HTML", "CSS", "Next.js"]) \
        .add_skill("Backend", ["Node.js", "Python", "FastAPI", "Express.js"]) \
    .end_section() \
    .add_interests(language="EN") \
        .add_interests(["Football", "Running", "Videogames", "Dancing"]) \
    .end_section() \
    .add_languages(language="EN") \
        .add_languages(["English", "Spanish", "Italian"]) \
    .end_section()

# 2. Bloque de Customization
# Solo se incluirán las secciones mencionadas aquí. Las secciones 'Skills', 'Interests' 
# y 'Languages' se omitirán al no tener una regla de inclusión explícita.
Customization(my_cv) \
    .add_filter("Experience", "LANGUAGE", "EN") \
    .add_filter("Education", "LANGUAGE", "EN") \
    .add_filter("Projects", "LANGUAGE", "EN") \
    .add_filter("Skills", "LANGUAGE", "EN") \
    .add_filter("Interests", "LANGUAGE", "EN") \
    .add_filter("Projects", "TAGS", "WEB") \
    .add_filter("Skills", "TAGS", "BACKEND") \
    # .add_filter("Languages", "LANGUAGE", "EN") \

# 3. Operación Terminal
# El método build() detecta el Customizer, aplica los filtros y genera la salida.
my_cv.build()