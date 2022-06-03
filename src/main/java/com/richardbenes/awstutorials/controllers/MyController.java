package com.richardbenes.awstutorials.controllers;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Controller
@Getter
@Slf4j
public class MyController {

    @Value("${custom.number}")
    private int number;

    final String bestColor;

    MyController(
        @Value("${custom.color}") String color
    ) {
        this.bestColor = color;

        // color, as a constructor parameter will be available now,
        // number, as an injected value will be available later
        log.info(
            "Initialized with custom.number {} and custom.color {}",
            number, color);
    }

    @GetMapping("/")
    ResponseEntity<?> home() {

        log.info(
            "MyController.home(); number {} color {}", 
            number, bestColor);

        return ResponseEntity
            .ok(
                "Hello, number " + this.getNumber() 
                + ", color " + this.getBestColor()
                + ", at " + Instant.now());
    }    
}
