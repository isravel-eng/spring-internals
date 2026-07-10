package com.isravel.iocworkingapplication;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Car Bean Created");
    }
    public void drive(){
        engine.Start();
        System.out.println("Car is Running...");
    }
}
