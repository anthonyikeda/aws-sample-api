package com.example.awssampleapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demoinfo")
    public ResponseEntity<String> getInfo() {
        return ResponseEntity.ok("We have a connection!");
    }
}

