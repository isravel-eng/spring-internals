# Auto Configuration - Code Working Flow

## Execution Flow

```
SpringApplication.run()

        │
        ▼

Read Dependencies

        │
        ▼

Read Auto Configuration Classes

        │
        ▼

Check Configuration Conditions

        │
        ▼

Required Libraries Found

        │
        ▼

Create Required Beans Automatically

        │
        ▼

ApplicationContext Ready

        │
        ▼

CommandLineRunner.run()
```

---

## What This Demonstrates

- Spring Boot inspects the project's dependencies.
- It automatically configures the required infrastructure.
- The developer does not manually configure common Beans.
- The application is ready to use with minimal setup.

---

## Key Takeaway

Auto Configuration does not replace your code—it removes repetitive configuration by creating commonly needed Beans automatically when the required conditions are met.