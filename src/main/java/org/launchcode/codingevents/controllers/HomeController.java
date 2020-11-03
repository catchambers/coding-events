package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
Created 11/3/2020
 */
@Controller
public class HomeController {

    @GetMapping
    public String index() {
        return "index";
    }

}

