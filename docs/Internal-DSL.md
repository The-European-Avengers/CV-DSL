# Internal DSL Exercise

In this document, we explain the process of creating an internal DSL.

## Internal DSL Syntax

### 1. Used Programming Language and Justification

* **Language:** Python.
* **Justification:** Python was chosen for its clean and minimalist syntax, which avoids mandatory braces and semicolons, allowing the DSL to closely resemble a human-readable configuration file or even natural language. Furthermore, Python's support for named arguments and its flexible object model make it ideal for implementing the **method chaining** technique used to map the metamodel's attributes explicitly.

### 2. Representative Example (Fluent API)
The following snippet from the `main.py` file demonstrates how the fluent API is used to build a profile hierarchically:

```python
my_cv = Profile("Lucas Gonzalez CV") \
    .with_metadata(
        style="Academic", 
        font="Times New Roman", 
        imgPath="~/Documents/Images/ProfilePicture.jpg"
    ) \
    .add_experience(language="EN") \
        .add_job("Software Engineer", "Google", "02-2020", "01-2022", ["Implemented internal tool"], ["CLOUD", "JAVA"]) \
    .end_section() \
    .add_projects(language="EN") \
        .add_project("REST API", "https://link.com", ["Implemented a REST API"], ["Node.js"], ["WEB"]) \
    .end_section() \
    .build()

```

### 3. Technique Explanation

* **Technique:** Method Chaining.
* **Explanation:** Each method in the `Profile` class and the `Section` subclasses (such as `Experience` or `Projects`) performs a configuration action and then returns `self` (the current instance) or a related context object. For example, `add_experience()` returns an `Experience` object to allow adding specific jobs to that section, while `end_section()` returns the parent `Profile` object to continue with the global configuration.

## Internal DSL Implementation

### 1. Implementation Technique and Why

* **Technique:** Builder Pattern with Contextual Method Chaining.
* **Why:** This technique was used to faithfully reflect the hierarchical structure defined in the metamodel. It allows the user to "enter" and "exit" specific contexts (sections) while maintaining data integrity. For instance, while in the `Experience` context, the API only allows adding `Job` objects, preventing structural errors during the DSL's design phase.

### 2. Execution Explanation

* **Execution Process:** The "execution" of the metamodel instance is triggered by the terminal `build()` method in the `Profile` class.
* **Steps of Execution:**
    * **Semantic Filtering:** The `build()` method first checks if a `customizer` object is linked to the profile. If present, it invokes the `apply_filters()` method from the `Customization` class.
    * **Rule Processing:** The `apply_filters()` method analyzes defined rules (such as `LANGUAGE` or `TAGS`) and modifies the profile's `sections` list to include only what was requested (e.g., only English sections or projects with the "WEB" tag).
    * **Structured Output:** Finally, the program iterates through the remaining metamodel objects and prints the CV to the console in a structured visual format, displaying the user data and the detailed content of each validated section.

