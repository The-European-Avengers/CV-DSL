# External DSL Code Generator

## First
### DSL
```
Metadata 
    style: "minimalistic" 
    font: "Helvetica" 
    imgPath: "/assets/profile_pic.jpg"

Userdata 
    name: "Ana García" 
    email: "ana.garcia@email.com" 
    telephoneNumber: "+34 612 345 678" 
    direction: "Av. Principal 45" 
    city: "Barcelona" 
    country: "España"

Experience language: "es"
    title: "Desarrolladora Senior" 
    description: ["Liderazgo de equipo", "Desarrollo backend en Java"] 
    company: "Tech Solutions" 
    startDate: "2021-03-01" 
    endDate: "2023-12-31" 
    tags: ["Java", "Liderazgo", "Backend"]

    title: "Programadora Junior" 
    description: ["Mantenimiento de bases de datos", "Resolución de bugs"] 
    company: "DataCorp" 
    startDate: "2019-06-01" 
    endDate: "2021-02-28" 
    tags: ["SQL", "Mantenimiento"]

Projects language: "es"
    title: "Mi propio DSL"
    description: ["Un lenguaje de dominio específico para currículums"]
    technologies: ["Xtext", "Java", "Eclipse"]
    link: "https://github.com/anagarcia/resume-dsl"
    tags: ["DSL", "Compiladores"]

Education language: "es"
    title: "Grado en Ingeniería Informática" 
    institution: "Universitat Politècnica" 
    graduationDate: "2019-05-15" 
    country: "España" 
    tags: ["Universidad", "Informática"]

Skills language: "es"
    title: "Lenguajes de Programación" 
    tags: ["Java", "Python", "TypeScript"]
    
    title: "Herramientas"
    tags: ["Git", "Docker", "Eclipse"]

Languages language: "es"
    tags: ["Inglés", "Español", "Catalán"]

Customization 
include Profile where language "es"
include Education where endDate before "2021"
```
### Code Generater Output
```python

from Models import Profile, Customization


cv = Profile("Ana García")

cv.with_metadata("minimalistic", "Helvetica", "/assets/profile_pic.jpg")
cv.with_userdata(
    "Ana García", 
    "ana.garcia@email.com", 
    "+34 612 345 678", 
    "Av. Principal 45", 
    "España", 
    "Barcelona"
)


exp = cv.add_experience("es")
exp.add_job("Desarrolladora Senior", "Tech Solutions", "2021-03-01", "2023-12-31", ["Liderazgo de equipo", "Desarrollo backend en Java"], ["Java", "Liderazgo", "Backend"])
exp.add_job("Programadora Junior", "DataCorp", "2019-06-01", "2021-02-28", ["Mantenimiento de bases de datos", "Resolución de bugs"], ["SQL", "Mantenimiento"])
projects = cv.add_projects("es")
projects.add_project("Mi propio DSL", "https://github.com/anagarcia/resume-dsl", ["Un lenguaje de dominio específico para currículums"], ["Xtext", "Java", "Eclipse"], ["DSL", "Compiladores"])
education = cv.add_education("es")
education.add_degree("Grado en Ingeniería Informática", "Universitat Politècnica", "2019-05-15", "España", ["Universidad", "Informática"])
skills = cv.add_skills("es")
skills.add_skill("Lenguajes de Programación", ["Java", "Python", "TypeScript"])
skills.add_skill("Herramientas", ["Git", "Docker", "Eclipse"])
cv.add_languages("es").add_languages(["Inglés", "Español", "Catalán"])


customizer = Customization(cv)

customizer.add_filter("Education", "LANGUAGE", "es")

cv.build()
```

## Second Example
### DSL

```
Metadata 
    style: "professional" 
    font: "Georgia" 
    imgPath: "/assets/profile_pic_lucia.jpg"

Userdata 
    name: "Lucía Fernández" 
    email: "lucia.fernandez@email.com" 
    telephoneNumber: "+593 611 987 234" 
    direction: "Calle del Sol 22" 
    city: "Quito" 
    country: "Ecuador"

Experience language: "es"
    title: "Ingeniera de Software" 
    description: ["Diseño de microservicios", "Implementación de APIs REST en Python"] 
    company: "NovaTech" 
    startDate: "2022-01-10" 
    endDate: "2024-11-30" 
    tags: ["Python", "Microservicios", "Backend"]

    title: "Desarrolladora Web" 
    description: ["Desarrollo de interfaces con React", "Optimización de rendimiento frontend"] 
    company: "WebFactory" 
    startDate: "2020-04-01" 
    endDate: "2021-12-20" 
    tags: ["React", "Frontend", "UX"]

Projects language: "es"
    title: "Plataforma de Gestión Académica"
    description: ["Sistema para administración de cursos, matrículas y evaluaciones"]
    technologies: ["Django", "PostgreSQL", "Docker"]
    link: "https://github.com/luciaf/academic-platform"
    tags: ["Web", "Educación"]

Education language: "es"
    title: "Máster en Ciencia de Datos" 
    institution: "Universidad de Valencia" 
    graduationDate: "2021-07-10" 
    country: "España" 
    tags: ["Máster", "Datos"]

Skills language: "es"
    title: "Lenguajes de Programación" 
    tags: ["Python", "JavaScript", "SQL"]
    
    title: "Herramientas"
    tags: ["Git", "Docker", "Postman"]

Languages language: "es"
    tags: ["Español", "Inglés", "Francés"]

Customization 
include Profile where language "es"
include Education where endDate before "2022"
```

### Code Generator Output
```python

from Models import Profile, Customization


cv = Profile("Lucía Fernández")

cv.with_metadata("professional", "Georgia", "/assets/profile_pic_lucia.jpg")
cv.with_userdata(
    "Lucía Fernández", 
    "lucia.fernandez@email.com", 
    "+593 611 987 234", 
    "Calle del Sol 22", 
    "Ecuador", 
    "Quito"
)


exp = cv.add_experience("es")
exp.add_job("Ingeniera de Software", "NovaTech", "2022-01-10", "2024-11-30", ["Diseño de microservicios", "Implementación de APIs REST en Python"], ["Python", "Microservicios", "Backend"])
exp.add_job("Desarrolladora Web", "WebFactory", "2020-04-01", "2021-12-20", ["Desarrollo de interfaces con React", "Optimización de rendimiento frontend"], ["React", "Frontend", "UX"])
projects = cv.add_projects("es")
projects.add_project("Plataforma de Gestión Académica", "https://github.com/luciaf/academic-platform", ["Sistema para administración de cursos, matrículas y evaluaciones"], ["Django", "PostgreSQL", "Docker"], ["Web", "Educación"])
education = cv.add_education("es")
education.add_degree("Máster en Ciencia de Datos", "Universidad de Valencia", "2021-07-10", "España", ["Máster", "Datos"])
skills = cv.add_skills("es")
skills.add_skill("Lenguajes de Programación", ["Python", "JavaScript", "SQL"])
skills.add_skill("Herramientas", ["Git", "Docker", "Postman"])
cv.add_languages("es").add_languages(["Español", "Inglés", "Francés"])


customizer = Customization(cv)

customizer.add_filter("Education", "LANGUAGE", "es")

cv.build()

```

## Third Example
### DSL
```
Metadata 
    style: "clean" 
    font: "Calibri" 
    imgPath: "/assets/profile_pic_emma.jpg"

Userdata 
    name: "Emma Johnson" 
    email: "emma.johnson@email.com" 
    telephoneNumber: "+1 415 555 9021" 
    direction: "742 Evergreen Terrace" 
    city: "San Francisco" 
    country: "USA"

Experience language: "en"
    title: "Senior Backend Engineer" 
    description: ["Designed scalable REST APIs", "Led migration to cloud-native architecture"] 
    company: "CloudNova" 
    startDate: "2021-02-15" 
    endDate: "2024-10-31" 
    tags: ["Backend", "Cloud", "Python"]

    title: "Software Engineer" 
    description: ["Built internal tooling for analytics", "Improved CI/CD pipelines"] 
    company: "DataBridge" 
    startDate: "2018-06-01" 
    endDate: "2021-01-30" 
    tags: ["DevOps", "Automation", "Analytics"]

Projects language: "en"
    title: "Smart Task Manager"
    description: ["Productivity web app with AI-based prioritization"]
    technologies: ["FastAPI", "React", "PostgreSQL"]
    link: "https://github.com/emmaj/smart-task-manager"
    tags: ["AI", "WebApp"]

Education language: "en"
    title: "BSc in Computer Science" 
    institution: "University of California, Berkeley" 
    graduationDate: "2018-05-20" 
    country: "USA" 
    tags: ["Bachelor", "Computer Science"]

Skills language: "en"
    title: "Programming Languages" 
    tags: ["Python", "Java", "TypeScript"]
    
    title: "Tools"
    tags: ["GitHub Actions", "Docker", "Kubernetes"]

Languages language: "en"
    tags: ["English", "Spanish"]

Customization 
include Profile where language "en"
include Education where endDate before "2020"
```

### Code Generator Output
```python

from Models import Profile, Customization


cv = Profile("Emma Johnson")

cv.with_metadata("clean", "Calibri", "/assets/profile_pic_emma.jpg")
cv.with_userdata(
    "Emma Johnson", 
    "emma.johnson@email.com", 
    "+1 415 555 9021", 
    "742 Evergreen Terrace", 
    "USA", 
    "San Francisco"
)


exp = cv.add_experience("en")
exp.add_job("Senior Backend Engineer", "CloudNova", "2021-02-15", "2024-10-31", ["Designed scalable REST APIs", "Led migration to cloud-native architecture"], ["Backend", "Cloud", "Python"])
exp.add_job("Software Engineer", "DataBridge", "2018-06-01", "2021-01-30", ["Built internal tooling for analytics", "Improved CI/CD pipelines"], ["DevOps", "Automation", "Analytics"])
projects = cv.add_projects("en")
projects.add_project("Smart Task Manager", "https://github.com/emmaj/smart-task-manager", ["Productivity web app with AI-based prioritization"], ["FastAPI", "React", "PostgreSQL"], ["AI", "WebApp"])
education = cv.add_education("en")
education.add_degree("BSc in Computer Science", "University of California, Berkeley", "2018-05-20", "USA", ["Bachelor", "Computer Science"])
skills = cv.add_skills("en")
skills.add_skill("Programming Languages", ["Python", "Java", "TypeScript"])
skills.add_skill("Tools", ["GitHub Actions", "Docker", "Kubernetes"])
cv.add_languages("en").add_languages(["English", "Spanish"])


customizer = Customization(cv)

customizer.add_filter("Education", "LANGUAGE", "en")

cv.build()
````
