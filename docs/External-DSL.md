# External DSL

In this document, we explain the process of creating an external DSL.

## Example of Our External DSL Syntax
```
Metadata
	style: "Academic"
	font: "Times New Roman"
	imgPath: "~/Documents/Images/ProfilePicture.jpg"
	
Userdata
	name: "Lucas Gonzalez"
	email: "lucasgonz@gmail.com"
	telephoneNumber: "+45 600000000"
    direction: "Some Street 123"
    city: "Odense"
    country: "Denmark"
	
Experience
	language: "EN"
	title: "Software Engineer"
		description: ["Implemented an internal tool for analyitics"]
		company: "Google"
		startDate: "02-2020"
		endDate: "01-2022"
		tags: ["CLOUD", "JAVA", "DEVELOPER"]
    title: "Software Engineer2"
		description: ["Implemented an website for a restaurant"]
		company: "McDonald's"
		startDate: "02-2022"
		endDate: "01-2023"
		tags: ["WEB", "JAVASCRIPT", "DEVELOPER"]
	
Experience
	language: "ES"
	title: "Ingeniero de Software"
		description: ["Implementé una herramienta interna para análisis"]
		company: "Google"
		startDate: "02-2020"
		endDate: "01-2022"
		tags: ["CLOUD", "JAVA", "DESARROLLADOR"]
    title: "Ingeniero de Software2"
        description: ["Implementé un sitio web para un restaurante"]
        company: "McDonald's"
        startDate: "02-2022"
        endDate: "01-2023"
        tags: ["WEB", "JAVASCRIPT", "DESARROLLADOR"]
	
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
        graduationDate: "2018"
        country: "Denmark"
        tags: ["MASTER", "UNIVERSITY"]

Skills
	language: "EN"
	title: Frontend
		tags: ["React", "HTML", "CSS", "Next.js"]
	title: Backend
		tags: ["Node.js", "Python", "FastAPI", "Express.js"]
Interests
	language: "EN"
	tags: ["Football", "Running", "Videogames", "Dancing"]
Languages
	language: "EN"
	tags: ["English", "Spanish", "Italian"]
	
Customization
	include Profile where language EN
	include Education where tags include "UNIVERSITY"
	include Projects where tags include "WEB"
    include Experience where startDate after "01-01-2021"
	
```	

## Syntax as an EBNF Grammar

```
Profile        ::= Metadata Userdata Sections Customization 

Metadata       ::= "Metadata" "style:" String "font:" String "imgPath:" String
Userdata       ::= "Userdata" "name:" String "email:" String "telephoneNumber:" String "direction:" String "city:" String "country:" String

Sections       ::= (Experience | Projects | Education | Skills | Interests | Languages)+

Experience     ::= "Experience" "language:" String (Job)+
Job            ::= "title:" String "description:" StringList "company:" String "startDate:" Date "endDate:" Date "tags:" StringList

Projects       ::= "Projects" "language:" String (Project)+
Project        ::= "title:" String "description:" StringList "technologies:" StringList "link:" String "tags:" StringList

Education      ::= "Education" "language:" String (Degree)*
Degree         ::= "title:" String "institution:" String "graduationDate:" Date "country:" String "tags:" StringList

Skills         ::= "Skills" "language:" String (Skill)+
Skill          ::= "title:" String "tags:" StringList

Interests      ::= "Interests" "language:" String "tags:" StringList
Languages      ::= "Languages" "language:" String "tags:" StringList

Customization  ::= "Customization" "include Profile where language" String  Rule*

Rule           ::= "include" SectionType "where" Filter

SectionType    ::= "Experience" | "Projects" | "Education" | "Skills" | "Interests" | "Languages"

Filter         ::= GeneralFilter | TemporalFilter

GeneralFilter  ::= "tags include" String
TemporalFilter ::= ("startDate after" Date | "endDate before" Date)  (* This filter can only be applied to Experience and Education *)

StringList     ::= "[" String ("," String)* "]"
Date           ::= String
String         ::= '"' [^"]* '"'
```