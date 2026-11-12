package com.manage.customermanagement.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {

    @GetMapping("/management/login")
    public String login() {
        System.out.print(">>>>>>>>>>>>>>찍힘");
        return "forward:/index.html";
    }
}