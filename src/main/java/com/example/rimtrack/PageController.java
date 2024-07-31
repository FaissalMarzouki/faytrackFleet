package com.example.rimtrack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PageController {

    @RequestMapping("/mymap")
    public String homePage(){
        return "mymap";
    }
    @GetMapping("/listeVehicules")
    public String listeVehicules(){
        return "listeVehicules.html";
    }

}
