package com.example.sb.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, Welcome to the Spring Boot!";
    }

    @GetMapping ("/hello/{name}")
        public String helloWithName(@PathVariable String name){
            return "Hello! " + name + "!, welcome to Spring Boot's world!";
    }
}
