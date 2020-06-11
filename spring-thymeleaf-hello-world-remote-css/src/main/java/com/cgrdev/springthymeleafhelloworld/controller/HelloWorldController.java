package com.cgrdev.springthymeleafhelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(Model model) {

        // add message to the model
        model.addAttribute("greeting", new java.util.Date());

        // return web page
        return "helloworld";
    }
}
