package com.lacky.bibliotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FreeResourcesController {

    @GetMapping("/about")
    public String about() {
        return "/free/about";
    }

    @GetMapping("/login")
    public String login() {
        return "/free/login";
    }

}
