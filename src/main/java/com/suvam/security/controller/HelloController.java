package com.suvam.security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("hello")
    public String greet(HttpServletRequest request){
        return "Hello World!";
    }
    @GetMapping("about")
    public String about(HttpServletRequest request){
        return "about suvam" + request.getSession().getId();
    }
}
