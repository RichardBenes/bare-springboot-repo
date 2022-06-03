package com.richardbenes.awstutorials.controllers;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Controller
@Getter
@Slf4j
public class MyController {

    int number = 1;
    Instant currentTime;

    @GetMapping("/")
    ResponseEntity<?> home() {

        log.info("MyController.home()");

        return ResponseEntity
            .ok("Hello " + this.getNumber() + " at " + Instant.now());
    }    
}
