package com.example.rimtrack.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {///login controller handle by this
        registry.addViewController("/login").setViewName("login.html");//login controller, and user will redirect to this page auth_login.html
                registry.addViewController("/register").setViewName("register.html");//login controller, and user will redirect to this page auth_login.html
        registry.addViewController("/dashboard").setViewName("dashboard.html");//login controller, and user will redirect to this page auth_login.html


    }
    
}
