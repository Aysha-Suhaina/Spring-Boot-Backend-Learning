package com.example.product_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // ✅ disables CSRF for Postman testing
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() // ✅ all endpoints require auth
            )
            .httpBasic(Customizer.withDefaults()); // ✅ enables basic auth (Postman)
        return http.build();
    }
}
