package com.sda.action.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class Test {
    @GetMapping
    public ResponseEntity<String> get(){
        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }
}
