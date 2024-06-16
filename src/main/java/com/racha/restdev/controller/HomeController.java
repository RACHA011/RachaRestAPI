package com.racha.restdev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class HomeController {
    @GetMapping("/")
    public String demo() {
        return "hello world";
    }
    // @GetMapping("/test")
    // @Tag(name = "Test", description = "The Test Api.")
    // @SecurityRequirement(name = "rachadev-demo-api")
    // public String test() {
    //     return "Test Api";
    // }
    
}
