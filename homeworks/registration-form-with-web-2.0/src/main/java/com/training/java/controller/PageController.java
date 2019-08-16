package com.training.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/login")
    public String loginPage(){
        return "loginForm";
    }

    @GetMapping("/registration")
    public String registration() {
        return "register";
    }
}
