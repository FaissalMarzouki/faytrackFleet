package com.example.rimtrack.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.rimtrack.DTO.LoginDTO;
import com.example.rimtrack.DTO.UserDTO;
import com.example.rimtrack.entity.User;
import com.example.rimtrack.repository.UserRepository;
import com.example.rimtrack.response.LoginResponse;
import com.example.rimtrack.service.UserService;
@Service

public class UserIMPL implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addUser(UserDTO userDTO) {

        User user = new User(userDTO.getUserId(), userDTO.getUsername(), this.passwordEncoder.encode(userDTO.getPassword()), userDTO.getRole());

        userRepository.save(user);

        return user.getUsername();

}
    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        // TODO Auto-generated method stub

        String msg = "";
        User user1 = userRepository.findByUsername(loginDTO.getUsername());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userRepository.findOneByUsernameAndPassword(loginDTO.getUsername(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
 
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }
    }
    
}
