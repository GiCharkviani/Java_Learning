package com.gio.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class FunRestController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World! Time on sever is " + LocalDateTime.now();
    }
}
