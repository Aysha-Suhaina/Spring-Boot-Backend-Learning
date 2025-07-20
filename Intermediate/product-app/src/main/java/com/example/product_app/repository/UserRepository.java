package com.example.product_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.product_app.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
