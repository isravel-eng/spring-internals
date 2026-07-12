# Bean Scopes - Code Working Flow

## Execution Flow

```
SpringApplication.run()

        │
        ▼

ApplicationContext Created

        │
        ▼

Component Scan

        │
        ▼

Engine Bean Registered

        │
        ▼

Runner Bean Created

        │
        ▼

CommandLineRunner.run()

        │
        ▼

ApplicationContext.getBean()

        │
        ▼

Spring checks Bean Scope

        │
        ├───────────────┐
        │               │
 Singleton         Prototype
        │               │
Return same     Create new
instance         instance
```

---

## Try This

### Singleton

```java
@Scope("singleton")
```

Output:

```
Engine Bean Created : com.isravel.beanscopes.Engine@5a2d131d

First Bean  : com.isravel.beanscopes.Engine@5a2d131d
Second Bean : com.isravel.beanscopes.Engine@5a2d131d

Same Instance : true
```

---

### Prototype

```java
@Scope("prototype")
```

Output:

```
Engine Bean Created : com.isravel.beanscopes.Engine@2d98a335
Engine Bean Created : com.isravel.beanscopes.Engine@16b98e56

First Bean  : com.isravel.beanscopes.Engine@2d98a335
Second Bean : com.isravel.beanscopes.Engine@16b98e56

Same Instance : false
```

---

## What This Demonstrates

- **Singleton** returns the same Bean instance every time.
- **Prototype** creates a new Bean each time it is requested.
- `ApplicationContext.getBean()` respects the configured Bean scope.