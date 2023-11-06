package com.lacky.bibliotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootMenuController {

    @GetMapping("/root")
    public String root() {
        return "/root/rootMenu";
    }

}
