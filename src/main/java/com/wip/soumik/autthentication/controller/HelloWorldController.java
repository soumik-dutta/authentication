package com.wip.soumik.autthentication.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class HelloWorldController {
    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello World";
    }
}
