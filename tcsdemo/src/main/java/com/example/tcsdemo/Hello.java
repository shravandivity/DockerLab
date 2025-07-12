package com.example.tcsdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Hello {
    
        
    @GetMapping("/hello")
    public String sayHello()
    {
        return "Hello! Welcome to Java API!";
    }
}
