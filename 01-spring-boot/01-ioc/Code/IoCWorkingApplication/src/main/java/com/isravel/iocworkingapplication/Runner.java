package com.isravel.iocworkingapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private final Car car;
    public Runner(Car car) {
        this.car = car;
    }
    public void run(String... args) {
        car.drive();
    }
}
