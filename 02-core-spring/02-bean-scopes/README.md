# Bean Scopes 
## Concept 
Bean Scope concept the lifecycle and visibility of a Spring Bean within  the IoC Container.

It determines how many instances of a Bean Spring creates and how long those instances live.

---
## Why Bean Scopes?
Different applications require different object lifecycle.

For example

- A database configuration should have only one instance
- A shopping cart should be unique for each user
- Temporary objects may need to be created every time they are requested

Bean Scopes allow Spring to manage these different lifecyles.

---
## Types of Bean Scopes
### Singleton (Default)

- Only one instance of the Bean is created
- The same instance is shared throughout the application

```java
@Component
@Scope("singleton")
public class Engine{
}
```

---
### Prototype

- A new Bean instance is created every time it is required.
```java
@Component
@Scope("prototype")
public class Engine{
}
```
---
### Request

- One Bean instance per HTTP request
- Available only in web applications

---
### Session 
- One Bean instance per user session
- Available only in web applications
---
### Application
- One Bean instance for the entire ServletContext.
---
### WebSocket 
- One Bean instance per WebSocket session
---
## Singleton vs Protype

| Singleton | Prototype |
|------------|-----------|
| One instance | New instance every request |
| Default scope | Must be specified |
| Shared | Not shared |
| Managed throughout application | Created on demand |

---
## Common Mistakes

- Trying to use Request or Session in an non-web applicatino
- Using Prototype when Singleton is sufficient
---
# Interview Questions

### What is Bean Scope?
Bean scope defines how Spring creates and manages Bean instances.

---
### What is the defualt Bean Scope?
 
Singleton

---
### Which scope creates a new object every time?
Prototype.

---
### Are Request and Session scopes available in console applications?
 No

They are only available in web applications

---

## Key takeawy

Bean Scope determines **how many Bean instances Spring creates** and **how long they exist**. The default scope is **Singleton**.
