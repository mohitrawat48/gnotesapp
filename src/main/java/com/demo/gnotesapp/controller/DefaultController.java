package com.demo.gnotesapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String defaultRoute(){
        return "Hi, Welcome to G-Notes App test1";
    }
}
