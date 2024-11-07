package com.example.hello.hello.controller;

import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("api/v1/hello")
public class HelloController {
    @GetMapping
    @ResponseBody
    public Map<String, String> helloString() {
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "Hello World");
        return map;
    }
    
}
