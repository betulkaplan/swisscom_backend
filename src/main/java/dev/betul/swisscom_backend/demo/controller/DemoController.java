package dev.betul.swisscom_backend.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class DemoController {
    @GetMapping
    public ResponseEntity<String> getDemoResponse(){
        return ResponseEntity.ok("Hello from endpoint");
    }

}
