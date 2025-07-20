package com.example.product_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.product_app.model.Orders;
import com.example.product_app.model.User;
import com.example.product_app.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUserWithoutOrders(User user){
        for(Orders orders:user.getOrders()){
            orders.setUser(user);
            
        }
        return userRepository.save(user);
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


    public User getUserById(Long id){
        return userRepository.findById(id).orElseThrow(()->new RuntimeException("user not found"));
    }
    
}
