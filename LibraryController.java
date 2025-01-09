package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("api/html")

public class LibraryController {

    @GetMapping

    public String getAll(Model model) {

        String data = "MyName";
        model.addAttribute("mydatavariable", data);
        return "books";
    }

}