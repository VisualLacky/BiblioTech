package com.lacky.bibliotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/readers")
public class ReaderController {

    @GetMapping()
    public String readersMenu(){
        return "/readers/manageReadersMenu";
    }

}
