package com.example.sb.first.controller;

import com.example.sb.first.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    //SLF4j log implementation - started
    private static final Logger logger= LoggerFactory.getLogger(FirstRestController.class);
    //SLF4j log implementation - ended
    @GetMapping("/hello")

    public String hello(){
        logger.info("Received request for /hello");
        return "Hello, Welcome to the Spring Boot!";
    }

    @GetMapping ("/hello/{name}")
    public String helloWithName(@PathVariable String name){
        //exception handling implementation - started
        if(name.length() < 3){
            throw new ResourceNotFoundException("Name must have at least 3 characters");
        }
        //exception handling implementation - ended
        logger.info("Received request for /hello/{}", name);
        return "Hello, " + name + "!, welcome to Spring Boot's world!";
    }
}
