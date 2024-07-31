package com.example.rimtrack.service;

import org.springframework.stereotype.Service;

import com.example.rimtrack.DTO.LoginDTO;
import com.example.rimtrack.DTO.UserDTO;
import com.example.rimtrack.response.LoginResponse;
public interface UserService {
        String addUser(UserDTO userDTO);

        LoginResponse loginUser(LoginDTO loginDTO);

}
