# Auto Configuration

## Concept 
Auto configuration is a Spring boot feature that automatically configures the applications based on the dependencies available in the project and the existing configuration.

Instead of manually configuring every Bean, Spring boot intelligently creates and configures them

----
## Why Auto Configuration?
Without Auto configuration, developers must:

- create configuration classes
- Define Beans manually
- Configure third-party libraries
- Write a lot of boilerplate code

Auto Configuration reduces this work and allows developers to focus on business logic.

---
## How Auto Configuration Works
 1. The application starts 
2. Spring Boot reads the project's dependencies
3. It checks predefined Auto Configuration classes
4. It evaluates conditions such as:
   - Is a particular library present?
   - Does a Bean already exist?
   - Is a property enabled?
5. If all conditions are satisfied, Spring Boot creates the required Beans automatically.

---
## Example 
When the following dependency is added
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>-
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
Spring boot automatically configures:
- Embedded Tomcat 
- Dispatcher Servlet
- Jackson ObjectMapper
- Request Mapping infrastructure
- Error handling
- Message converters

No manual configuration is required.

---
## Common mistakes
- Thinking Auto configuration creates every Bean
- Manually creates Beans that already exist
- Forgetting that user-defined Beans override auto-configured Beans
- Confusing Starters with Auto Configuration.

---
## Interview Questions 
### What is Auto Configuration?
A feature that automatically configures Spring Beans based on project dependencies and application settings

---
### Does Auto configuration always create Beans?
No

It creates Beans only when the required conditions are satisfied.

---
### How is Auto Configuration  different from Starters?
- **Starter** -> Brings required libraries.
- **Auto Configuration** -> Configures those libraries automatically

---
### Can Auto Configuration be overrridden?
Yes.

If the developer defines a Bean of the same type, Spring Boot usually backs off and uses the developer's Bean

---
## Key Takeaway
Starters provide the libraries.

Auto configuration uses those libraries to automaticallly configure the application
