# Idea
- CV generator
	- Define entities for Personal Info, Work Experience, Education, and Skills.
	- Ability to switch between different output styles (e.g., "Minimalist", "Academic", "Modern") via a single keyword.
	- Ensure dates are logical (e.g., `end_date` cannot be before `start_date`) and mandatory fields (like email or phone) are present.
	- Output in Latex or the pdf compiled or plain text
	- Secciones predefinidas como experience
	- Permitir crear tus propias secciones y definir el estilo
	- Seleccionar el lenguaje, debe estar duplicado
	- Seleccionar formato del output
	- Dependiendo del estilo se renderiza la foto o no
```
Profile myCV {
	Metdata {
		style: "Academic",
		font: "Times New Roman"
		picture: "path"
		
	}
	
	
	
	Section UserData {
		name: "Anders"
		email: "anders@gmail.com"
		telefoneNumebr: "+45 600000000"
	}
	
    Section Experience ES { //Define all your experience
        Job "Google" {
            period: 2020-02 to 2022-01
            tags: [CLOUD, JAVA]
        }
    }
    
    Section Experience EN { //Define all your experience
        Job "Google" {
            period: 2020-02 to 2022-01
            tags: [CLOUD, JAVA]
        }
    }
    
    Section Projects { //Define all your projects
	    I4 Pizza Factory {
		    link: "https://..."
		    description: "Text..."
		    technologies: "JAVA"
	    }
    }
    
    Section Skills {
	  Frontend: {
		  React, HTML
		  }  
    }
    
    Section Interests {
	    Football
    }
    
    Section Languages {
	    English, Spanish
    }
    
    // Complex Logic: Generate a "Tailored" CV selecting the best projects for the job requirements
    View SeniorDevView for "Recruiter" {
        include Experience where tags.contains(JAVA)
        include Projects where technologies.contains(JAVA)
        exclude Interests Section
        include Profile where language ENGLISH
    }
}
```

Proposal:
Our idea is to create a specialized language designed to separate professional content from visual presentation, enabling users to have a single source of data that can be dynamically filtered into tailored resumes without thinking on how to display it. By defining entities for experience, education, and skills with multi-language support, the DSL uses a logic-based system to programmatically include or exclude sections based on job requirements. It ensures data integrity through semantic validation, such as verifying that end dates follow start dates, and offers seamless output switching between different styles and the output could be in LaTeX, PDF, or plain text formats.

Possible example:
```
Profile myCV {
	Metdata {
		style: "Academic",
		font: "Times New Roman"
		picture: "path"
		
	}
	
	
	
	Section UserData {
		name: "Anders"
		email: "anders@gmail.com"
		telefoneNumebr: "+45 600000000"
	}
	
    Section Experience ES { //Define all your experience
        Job "Google" {
            period: 2020-02 to 2022-01
            tags: [CLOUD, JAVA]
        }
    }
    
    Section Experience EN { //Define all your experience
        Job "Google" {
            period: 2020-02 to 2022-01
            tags: [CLOUD, JAVA]
        }
    }
    
    Section Projects { //Define all your projects
	    I4 Pizza Factory {
		    link: "https://..."
		    description: "Text..."
		    technologies: "JAVA"
	    }
    }
    
    Section Skills {
	  Frontend: {
		  React, HTML
		  }  
    }
    
    Section Interests {
	    Football
    }
    
    Section Languages {
	    English, Spanish
    }
    
    // Complex Logic: Generate a "Tailored" CV selecting the best projects for the job requirements
    View SeniorDevView for "Recruiter" {
        include Experience where tags.contains(JAVA)
        include Projects where technologies.contains(JAVA)
        exclude Interests Section
        language ENGLISH
    }
}
```
