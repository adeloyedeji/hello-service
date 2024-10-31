package com.example.hello.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/hello")
public class HelloController {
    @GetMapping
    public String helloString() {
        return "Hello World";
    }
    
}
