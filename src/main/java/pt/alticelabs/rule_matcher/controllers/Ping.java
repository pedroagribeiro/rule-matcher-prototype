package pt.alticelabs.rule_matcher.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class Ping {

    @GetMapping("")
    public ResponseEntity<?> ping() {
        return new ResponseEntity<>("Status: UP", HttpStatus.OK);
    }
    
}
