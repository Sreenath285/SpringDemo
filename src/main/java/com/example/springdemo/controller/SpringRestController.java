package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SpringRestController {

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello () {
        return "Hello from Sreenath";
    }
}
