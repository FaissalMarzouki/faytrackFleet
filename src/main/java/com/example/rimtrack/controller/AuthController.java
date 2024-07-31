package com.example.rimtrack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import com.example.rimtrack.DTO.LoginDTO;
import com.example.rimtrack.DTO.UserDTO;
import com.example.rimtrack.entity.User;
import com.example.rimtrack.response.LoginResponse;
import com.example.rimtrack.service.UserService;
@Controller
public class AuthController {

    private final UserService userService;

    @Autowired
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String getRegisterPage() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute UserDTO userDTO, Model model) {
        String id = userService.addUser(userDTO);
        model.addAttribute("userId", id);
        return "login";
    }

@PostMapping(value = "/login")
    public String loginUser(@ModelAttribute LoginDTO loginDTO) {
        LoginResponse loginResponse = userService.loginUser(loginDTO);
        if (loginResponse.isSuccess()) {
        return "redirect:/dashboard";
        } else {
        return "redirect:/login";
        }
    }
@GetMapping("/dashboard")
    public String index() {
        return "dashboard";
    }
  
}
