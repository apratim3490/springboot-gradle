package com.shukap.application.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello";
    }

}
