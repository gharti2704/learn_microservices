package com.learn_microservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
