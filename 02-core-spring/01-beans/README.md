# Spring Beans

## Concept

A Spring Bean is a java object created, configured and managed by the Spring IoC Container.

Instead of creating objects using the `new` keyword, Spring creates and manages these objects throughout their lifecycle.

---

## Why Beans?

Without Spring Beans:

- Developers create objects manually 
- Object lifecycle is managed by the application
- Dependency management becomes difficult.

Using Spring Beans provides:

- Centralized object management
- Dependency injection
- lifecycle management
- Loose coupling

---
## How Spring Creates Beans

1. Spring starts the applications
2. The IoC Container scans for components
3. Classes annotated with `@Component`,`@Service`,`@Repository` or `@Controller` are detected.
4. Spring creates Bean instances
5. Bean are stored inside the ApplicationContext
6. Dependencies are injected where required

---

## Ways to create beans

### 1. Using `@Component`
```java
@Component
public class Engine{
}
```
---
### 2. Using `@Bean`

```java
import java.beans.BeanProperty;

public class AppConfig {
    @Bean
    public Engine engine(){ 
        return new Engine();
    }
    
}
```
---
## Bean Naming

By default:
```java
@Component
public class Car{}
```

Bean name becomes:

```
car
```

Custom name:
```java
@Component("sportsCar")
public class Car{}
```
---
## Common Bean Annotations 

| Annotation    | Purpose |
|---------------|-----|
| `@Component`  |Generic Spring Bean|
| `@Service`    | Bussiness logic |
| `@Repository` | Data Access Layer|
|`@Controller`| MVC Controller|
|`@RestController`|REST API Controller|

---
## Common Mistakes
- Creating Spring Beans using `new`
- Forgetting component annotations 
- Assuming every Java object is a Spring Bean
- Creating duplicate Beans of the same type unintentionally
---

## Interview Questions 
### What is a Spring Bean?
A Java object managed by the Spring IoC Container.

---
### Where are Beans stored?
Inside the `ApplicationContext`

---
### Who creates a Bean?
The Spring IoC Container

---
### Is every Java object a Bean?
No.

Only objects registered with the Spring Container are Spring Beans.

---

## Key Takeaway 

A Spring Bean is any object that is created, configured and managed by the Spring IoC Container.