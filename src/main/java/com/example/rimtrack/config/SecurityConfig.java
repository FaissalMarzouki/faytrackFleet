package com.example.rimtrack.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;




@Configuration
//@EnableWebSecurity
public class SecurityConfig {


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    /* 
    @Autowired
    private UserDetailsService userDetailsService;

 @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
         http.authorizeHttpRequests((authorize) ->
                        authorize.requestMatchers("/register/**").permitAll()
                                .requestMatchers("/index").permitAll()
                                .requestMatchers("/api/vehic/**").permitAll()
                                .requestMatchers("/api/driver/**").hasRole("ADMIN")
                                .requestMatchers("/api/maintenance/**").permitAll()
                                .requestMatchers("/api/vidanges/**").permitAll()
                                .requestMatchers("/api/documents/**").permitAll()
                                .requestMatchers("/api/device/**").permitAll()
                                .requestMatchers("/api/fuels/**").permitAll()
                                .requestMatchers("/viewmap/**").permitAll()
                                .requestMatchers("/users").hasRole("ADMIN")


                ).formLogin(
                        form -> form
                                .loginPage("/login")
                                .loginProcessingUrl("/login")
                                .defaultSuccessUrl("/index")
                                .permitAll()
                ).logout(
                        logout -> logout
                                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                                .permitAll()
                );
        return http.build();
    }
        @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder());
    }
*/


}

