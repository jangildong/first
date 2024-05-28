package com.example.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping("/main")
    public String loginP() {

        return "main/main";
    }

    @RequestMapping("/login")
    public String contectp() {

        return "main/login";
    }

    @RequestMapping("/kategorie")
    public String indexp() {

        return "main/kategorie";
    }

    @RequestMapping("/notice")
    public String topicsDetailp() {

        return "main/notice";
    }



}
