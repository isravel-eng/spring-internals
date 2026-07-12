package com.sfl.beanscopes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private final ApplicationContext applicationContext;

    public Runner(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args) throws Exception {
        Engine engine1 = new Engine();
        Engine engine2 = new Engine();
        System.out.println();
        System.out.println("First Bean : "+engine1);
        System.out.println("Second Bean : "+engine2);
        System.out.println();

        System.out.println(" Same instance = "+(engine1==engine2));
    }
}
