package com.sarvesh;

import java.beans.ConstructorProperties;

public class Alien {

    private Computer com;
    private int age;

    public Alien(){
        System.out.println("Alien object created.");
    }
//
////    public Alien(int age){
////        this.age = age;
////    }

//    @ConstructorProperties({"age", "laptop"})
//    public Alien(int age, Laptop laptop){
//        System.out.println("Alien object created.");
//        this.age = age;
//        this.laptop = laptop;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Alien set age called.");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Alien Coding ...");
        com.process();
    }
}
