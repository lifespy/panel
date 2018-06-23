package com.not404.panel.controller;

import com.not404.panel.config.annotation.PrintLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Index {

    private final static Logger logger = LoggerFactory.getLogger(Index.class);

    @PrintLog
    @GetMapping("index")
    public String index(HttpServletRequest request, HttpServletResponse response){
        return "indexPage";
    }
}
