# Inversion of Control

## Concept

**Inversion of Control (IoC)** is a design principle where the control of creating and managing objects is transferred from the application to the Spring framework.

---

## Why IoC?

Without IoC, every class is responsible for creating its own dependencies, resulting in tightly coupled code that is difficult to maintain and test.

---

IoC solves this by:

- Reducing coupling between classes
- Supporting dependency injection
- Improving code maintainability
- Making applications easier to test
- Allowing Spring to manage object lifecycle 


---

## How Spring Archieves IoC

Spring uses an **IoC Container** (`ApplicationContext` - interface) to manage objects called **Beans**

The process is:

1. Spring starts the application.
2. It scans the project components (`@Component`,`@Service`,`@Repository`,etc).
3. It creates the required objects (Beans).
4. It stores them inside the IoC Container.
5. Whenever another class requires an object, Spring injects the existing Bean instead of creating a new one.

---

## Simple Example 

### Without IoC

```java
Engine engine = new Engine();
Car car = new Car();
```

### With IoC

```java
@Component 
class Engine{}

@Component
class Car{
    private final Engine engine;
    public Car(Engine engine){
        this.engine = engine;
    }
}
```
Spring automatically creates both objects and injects the `Engine` into `Car`.

---

## Common Mistakes 
- Confusing **IoC** with **Dependency Injection (DI)**.
- Forgetting component annotations (`@Component`,`@Service`,`@Repository`,etc)
- Assuming Spring manages every object automatically.

---

## Interview Questions 
### 1. What is Inversion of Control?
A design principle where object creation and management are handled by the framework instead of the application.

---
### 2. Is the IoC the same as Dependency Injection?
No.
- **IoC** is the design principle.
- **Dependency Injection** is one technique Spring uses to implement IoC.

---

### 3. What is the IoC Container?
The IoC Container is the core component of Spring responsible for creating, storing, configuring, and managing Beans.
Examples:
- `BeanFactory`
- `ApplicationContext`
---

### What are Beans?
Beans are Java objects created and managed by the Spring IoC Container.

---
