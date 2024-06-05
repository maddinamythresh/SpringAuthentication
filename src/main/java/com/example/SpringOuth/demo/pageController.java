package com.example.SpringOuth.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pageController {

    @GetMapping()
    public String log(){
        return "Hello";
    }

}
