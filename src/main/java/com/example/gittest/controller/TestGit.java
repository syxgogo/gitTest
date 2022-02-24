package com.example.gittest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestGit {

    @GetMapping("/hello")
    public String testgit(){
        return "ok";
    }
}
