# Spring Boot Starters

## Concept
Spring boot starters are pre-configured dependency packages that provide all the libraries required for a specific functionality.

Instead of adding multiple dependencies manually, we add a single starter dependency, and Spring boot automatically includes the required libraries.

---
## Why Spring Boot Starters 

Without Starters, developers have to:

- Find required libraries.
- Check compatible (corresponding) versions.
- Resolve dependency conflicts.
- Configure everything manually.

Spring Boots Starters simplify this process by providing a tested and compatible (corresponding) set of dependencies.

---
## How Spring Boot Starters Work
1. You add a Starter dependency.
2. Maven downloads the Starters.
3. The Starter brings all required libraries (transitive dependencies).
4. Spring Boot detects the available libraries.
5. Auto Configuration configures them automatically.

---

## Example 

Instead of adding:

- Spring MVC
- Jackson
- Validation
- Embedded Tomcat
- Logging

You simply add:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
Spring boot downloads using maven and configures using auto-configuration everything required for building REST APIs.

---
## Commonly Used Starters

| Starter | Purpose |
|------------|-------|
|Spring-boot-starter-web| Build REST APIs and Web Application |
|Spring-boot-starter-data-jpa | Database access using JPA & Hibernate|
| Spring-boot-starter-security| Authentication & Authorization|
|Spring-boot-starter-test| Testing with JUnit, Mockito, etc|
|Spring-boot-starter-validation| Bean Validation |

---

## Benefits

- Faster development
- Compatible dependency versions
- Less configuration
- Easy project setup

---

## Common Mistakes 

- Thinking a starter is a framework.
- Adding multiple Starters without understanding their purpose
- Asssuming a Starter contain only one dependency.
- Mixing incompatible spring boot versions
---
## Interview Questions 
### What is a Spring Boot Starter?
A Starter is a pre-configured dependency that bundles all libraries required for a specific feature.

---
### What are transitive dependencies?
Dependencies that are automatically downloaded because another dependency requires them.

Ex : spring-boot-starter-data-jpa brings 
- spring-boot-starter-jdbc
- hibernate-core
- spring-orm
- jakarta.persistence-api

---
### Does a Starter contain code?
No.

A Starter is mainly a dependency descriptor (POM) that pulls in the required libraries.

---
### Why are the starters useful?
They simplify dependency management and ensure all included libraries are compatible.

---
## Key Takeaway
A Spring Boot Starter is a convenient dependency package that bundles all required libraries for a specific feature, allowing developers to start building applications with minimal configuration.