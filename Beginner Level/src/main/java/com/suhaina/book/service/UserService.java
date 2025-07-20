package com.suhaina.book.service;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class UserService {
    @PostConstruct
    public void inint(){
        System.out.println("User Service ready!!");
    }

    @PreDestroy
    public void init(){
        System.out.println("user service destroyed");
    }
}
