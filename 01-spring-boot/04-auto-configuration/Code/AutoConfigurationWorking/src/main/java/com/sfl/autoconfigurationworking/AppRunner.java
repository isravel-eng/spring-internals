package com.sfl.autoconfigurationworking;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("Application started successfully");
    }
}
