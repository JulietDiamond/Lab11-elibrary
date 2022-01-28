package com.miu.educs.cs425.demowebapps.elibary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    @RequestMapping(value = {"/", "/elibary", "/elibary/home"})
    public String displayHomePage(){
        return "/home/index";
    }
}
