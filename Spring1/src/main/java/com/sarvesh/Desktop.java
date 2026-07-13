package com.sarvesh;

public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop object created");
    }

    @Override
    public void process(){
        System.out.println("Desktop processing ...");
    }
}
