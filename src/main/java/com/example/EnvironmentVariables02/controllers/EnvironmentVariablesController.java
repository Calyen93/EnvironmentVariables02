package com.example.EnvironmentVariables02.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentVariablesController {

    @Value("${app.welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/welcome")
    public String welcome() {
        return welcomeMsg;
    }
}
