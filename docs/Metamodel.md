# Metamodel
## List
- Profile/CV
- Metadata
- Userdata
- Section
	- Experience
	- Projects
	- Skills
	- Interests
	- Languages
	- Job
	- Project
	- Skill
	- Interest
	- Language

## Diagram


```mermaid
classDiagram
	Profile *-- Metadata
	Profile *-- Userdata
	Profile *-- Section
	Profile *-- Customization
	Customization *-- Rules
	Section <|-- Experience
	Section <|-- Projects
	Section <|-- Education
	Section <|-- Skills
	Section <|-- Interests
	Section <|-- Languages
	Experience *-- Job
	Projects *-- Project
	Education *-- Degree
	Skills *-- Skill
	Interests *-- Interest
	Languages *-- Language
	
	class Metadata {
		+ style : String
		+ font : String
		+ imgPath : String
	}
	
	class Userdata {
		+ name : String
		+ email : String
		+ telephoneNumber : String
	}
	
	class Rules {
		+ action : Enum[include/exclude]
		+ section : Section
		+ filter : String
	}
	
	class Section {
		+ language : String
	}
	
	class Job {
		+ title : String
		+ description : String [*]
		+ Company : String
		+ startDate : Date
		+ endDate : Date 
		+ tags : String [*]
	}
	
	class Project {
		+ title : String
		+ link : String
		+ description : String [*]
		+ technologies : String [*]
		+ tags : String [*]
	}
	
	class Degree {
		+ title : String
		+ institution : String
		+ graduationDate : Date
		+ country : String
		+ tags : String [*]
		  }
	  
	class Skill {
		+ title : String
		+ attributes : String [*]
	}  
	
	class Interest {
		+ values : String [*]
	}
	
	class Language {
		+ values : String [*]
	}
	
	
	
	classDef default fill:#D6EAF8,stroke:#2980B9,stroke-width:2px,color:#1B4F72;
```



## Possible DSL
```
Metadata
	style: "Academic"
	font: "Times New Roman"
	imgPath: "~/Documents/Images/ProfilePicture.jpg"
	
Userdata
	name: "Lucas Gonzalez"
	email: "lucasgonz@gmail.com"
	telephoneNumber: "+45 600000000"
	
Experience
	language: "EN"
	title: "Software Engineer"
		description: ["Implemented an internal tool for analyitics"]
		company: "Google"
		startDate: 02-2020
		endDate: 01-2022
		tags: [CLOUD, JAVA, DEVELOPER]
	
Experience
	language: "ES"
	title: "Ingeniero de Software"
		description: ["Implementé una herramienta interna para análisis"]
		company: "Google"
		startDate: 02-2020
		endDate: 01-2022
		tags: [CLOUD, JAVA, DESARROLLADOR]
	
Projects
	language: "EN"
	title: "REST API"
		description: ["Implemented a REST API for a shooping e-commerce", "Collaborate with experts"]
		technologies: ["Node.js", "Express"]
		link: "https://link.com"
		tags: ["WEB", "BACKEND"]
	title: "Pizza Web"
		description: ["Implemented a UI for a pizza restaurant", "Collaborate with experts"]
		technologies: ["Next.js", "React"]
		link: "https://link2.com"
		tags: ["WEB", "FRONTEND"]
Education
	language: "EN"
	title: "Master in Software Engineering"
	institution: "SDU"
	graduationDate: 2018
	country: "Denmark"
	tags: ["MASTER", "UNIVERSITY"]

Skills
	language: "EN"
	title: Frontend
		attributes: ["React", "HTML", "CSS", "Next.js"]
	title: Backend
		attributes: ["Node.js", "Python", "FastAPI", "Express.js"]
Interests
	language: "EN"
	values: ["Football", "Running", "Videogames", "Dancing"]
Languages
	language: "EN"
	values: ["English", "Spanish", "Italian"]
	
Customization
	include Profile where language EN
	exclude Education where filter
	include Projects where filter 
	exclude Skills
	
```	
