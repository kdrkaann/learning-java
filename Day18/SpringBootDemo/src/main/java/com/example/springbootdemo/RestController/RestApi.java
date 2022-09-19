package com.example.springbootdemo.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApi {

    @GetMapping("/")
    public String home(){
        return "Hello Spring Boot.";
    }

    @GetMapping("/name")
    public String name(){
        return "I'm Kadir Kaan Atalay.";
    }

    @GetMapping("/age")
    public String age(){
        return "I'm 20 years old.";
    }
}
