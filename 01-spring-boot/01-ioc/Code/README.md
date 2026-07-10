## Bean Creation Flow
```
SpringApplication.run()

        ↓

ApplicationContext Created

        ↓

Component Scan

        ↓

Engine Bean Created

        ↓

Car Bean Created

        ↓

Runner Bean Created

        ↓

CommandLineRunner.run()
```