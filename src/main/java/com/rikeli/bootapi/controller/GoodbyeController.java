package com.rikeli.bootapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goodbye")
public class GoodbyeController {

    @GetMapping("/")
    public String getHelloWorld(){
        return "Goodbye cruel world";
    }
}
