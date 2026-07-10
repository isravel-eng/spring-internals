package com.isravel.iocworkingapplication;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    public Engine() {
        System.out.println("Engine Bean Created");
    }

    public void Start(){
        System.out.println("Engine Started");
    }

}
