# Dependency Injection (DI)
## Concept 
Dependency injection (DI) is a design pattern in which the required dependencies of a class are provided by the Spring Framework instead of the class creating manually.

Spring performs Dependency Injections through the IoC Container.

---

## Why Dependency Injection?
Without DI , classes their own dependencies using the `new` keyword, resulting in tightly coupled code.

DI provides:

- Loos Coupling 
- Better Maintainability
- Easier Unit Testing
- Better Code Reusability

---
## How Spring Performs Dependecy Injection

1. Spring starts the applications.
2. The IoC Container scans for Components.
3. Spring creates all required beans.
4. Spring identifies constructor dependencies.
5. Required Beans are injected automatically.
6. The application receives fully initialized objects.

---
## Types of Dependency Injection
### Constructor Injection 
Dependencies are injected through the constructor
### Setter Injection
Dependencies are injected using setter methods.
### Field Injection
Dependencies are injected directly into fields using `Autowired`.

> Constructor Injections is recommended because it creates immutable dependencies and is easier to test.

---
# Simple Example 

Without DI
```java
Engine engine = new Engine();
Car car = new Car(engine());
```
With DI
```java
@Component
public class Car{
    private final Engine engine;
    public Car(Engine engine){
        this.engine = engine;
    }
}
```
Spring automatically provides the Engine Bean.

---
## Common Mistakes 

- Using `new` for Spring-managed classes.
- Confusing IoC with Dependency Injection.
- Using Field Injection everywhere.
- Forgetting component annotation.
---
## Interview Questions
### What is Dependency Injection?
A design pattern where dependencies are provided by the framework instead of being created manually.

---
### Is IoC the same as DI?
No.
- IoC is the principle.
- DI is one implementation of IoC.
---
### Why is Constructor Injection preferred?
- Immutable dependencies
- Mandatory dependencies are enforced
- Prevents NullPointerException
- Easier unit testing