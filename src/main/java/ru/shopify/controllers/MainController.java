package ru.shopify.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String mainPage(Model model){
        return "main";
    }
    @GetMapping("/buy")
    public String page(Model model){
        return "main";
    }
}
