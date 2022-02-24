package com.example.gittest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestGit {

    @GetMapping("/hello")
    public String testgit(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abcdefg",1,3);
        return stringBuffer.toString();
    }
}
