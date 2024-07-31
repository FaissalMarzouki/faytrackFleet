package com.example.rimtrack.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;


@Controller
public class MapController {

    @Value("${tomtom.apikey}")
    private String tomTomApiKey;

    @GetMapping("/viewmap")
    public String homePage(Model model) {
        model.addAttribute("apikey", tomTomApiKey);
        model.addAttribute("coolLocations", coolLocations());
        return "home";
    }



    // FOR JAVA 8 USERS :

  private List<Location> coolLocations() {
      return  Arrays.asList(new Location(new double[]{-6.9208655, 32.886023}, "khouribga"),
              new Location(new double[]{/*longitude */-6.360833,/*latitude */  }, "beni mellal"),
              new Location(new double[]{/*longitude */-7.3848547,/*latitude */ 33.6835086}, "Mohammadia"),
              new Location(new double[]{/*longitude */ -6.69062,/*latitude */32.50093 }, "fquih ben salah")

    );
  }

    private static class Location {
        private final double[] lnglat;
        private final String description;

        public Location(double[] lnglat, String description) {
            this.lnglat = lnglat;
            this.description = description;
        }

        public double[] getLnglat() {
            return lnglat;
        }

        public String getDescription() {
            return description;
        }
    }







}
