package com.example.firstdockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstDockerAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstDockerAppApplication.class, args);
    }

    @GetMapping("/test")
    public String healthController() {
        return "Hello from Docker Container";
    }

}
