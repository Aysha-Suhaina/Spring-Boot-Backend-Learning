package com.example.product_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.web.config.EnableSpringDataWebSupport;
//import org.modelmapper.ModelMapper;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class ProductAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductAppApplication.class, args);
    }

//     @Bean
//     public ModelMapper modelMapper(){
//     return new ModelMapper();
// }
}

// {
//     "product":"laptop" ,
//     "quantity": 1,
//     "method ": "UPI",
//     "amount ":0
// }
