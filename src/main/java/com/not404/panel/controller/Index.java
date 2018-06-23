package com.not404.panel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {
    @GetMapping("index")
    public String index(){
        return "indexPage";
    }
}
