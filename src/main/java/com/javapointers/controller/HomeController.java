package com.javapointers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String viewHome() {
        return "index";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "home";
    }
}
