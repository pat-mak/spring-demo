package com.example.springdemo.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        log.info("Hello from {}", name);
        return "Hello, " + name;
    }
}
