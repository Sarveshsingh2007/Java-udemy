package com.sarvesh.spring_sec_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    @GetMapping("/hello")
//    public String greet(HttpServletRequest request){
////        return "Hello World" + request.getSession().getId();
//        return "Hello world!";
//    }

    @GetMapping("/hello")
    public String greet(){
        return "Hello world!";
    }

    @GetMapping("/about")
    public String about(){
        return "This is about page.";
    }
}
