package com.sarvesh;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop object created.");
    }

    @Override
    public void process(){
        System.out.println("Laptop processing ...");
    }
}
