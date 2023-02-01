package com.gio.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String getHomePage() {

        return "home";
    }

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {

        return "fancy-login";
    }


}
