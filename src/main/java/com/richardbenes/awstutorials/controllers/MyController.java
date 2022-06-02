package com.richardbenes.awstutorials.controllers;

import java.time.Instant;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/home1")
    ResponseEntity<?> home() {
        return ResponseEntity.ok("You are home at " + Instant.now());
    }    
}
