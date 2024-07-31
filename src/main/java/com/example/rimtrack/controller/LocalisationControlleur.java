package com.example.rimtrack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class LocalisationControlleur {
        @GetMapping("/realtime")
    public String homePage() {
        
        return "realtime";
    }
}
