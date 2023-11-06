package com.lacky.bibliotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DatabaseManageController {

    @GetMapping("/db-reset-menu")
    public String dbResetMenu(){
        return "/databaseManage/databaseResetMenu";
    }

}
