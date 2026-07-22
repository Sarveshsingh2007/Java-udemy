package com.sarvesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
public class Alien {

//    @Autowired
    private Computer com;
    @Value("21")
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

    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Alien Coding ...");
        com.process();
    }
}
