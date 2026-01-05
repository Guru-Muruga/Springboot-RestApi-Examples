package com.example.sb.first.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    private static final Logger logger= LoggerFactory.getLogger(FirstRestController.class);
    @GetMapping("/hello")
    public String hello(){
        logger.info("Received request for /hello");
        return "Hello, Welcome to the Spring Boot!";
    }

    @GetMapping ("/hello/{name}")
    public String helloWithName(@PathVariable String name){
        logger.info("Received request for /hello/{}", name);
        return "Hello, " + name + "!, welcome to Spring Boot's world!";
    }
}
