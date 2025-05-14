package me.temeddix.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<String> sayHi() {
        return new ResponseEntity<>("hello world", HttpStatus.OK);
    }
}
