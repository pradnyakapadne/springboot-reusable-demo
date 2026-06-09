package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   @GetMapping("/")
    public String home() {
    return "Version 7 deployed from GitHub Actions";
}
}
