package com.example.devcontainerspringbootweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/test1")
    public String test1() {
        return "test1 was successful";
    }

    @GetMapping("/test2")
    public String test2() {
        return "test2 ok";
    }
}
