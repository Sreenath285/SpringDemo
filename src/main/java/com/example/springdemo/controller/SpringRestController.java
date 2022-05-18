package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello () {
        return "Hello from Sreenath";
    }
}
