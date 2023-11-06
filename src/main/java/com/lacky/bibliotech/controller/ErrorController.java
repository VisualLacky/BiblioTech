package com.lacky.bibliotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("errors")
    public String renderErrorPage() {
        return "free/error";
    }
}
