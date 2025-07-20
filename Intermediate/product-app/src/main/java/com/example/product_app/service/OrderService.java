package com.example.product_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product_app.repository.OrderRepository;
import com.example.product_app.repository.Paymentrepository;
import com.example.product_app.model.Orders;
import com.example.product_app.model.Payment;

import jakarta.transaction.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private Paymentrepository paymentrepository;

    @Transactional
    public void placeOrder(Orders order,Payment payment){
        orderRepository.save(order);

        if(payment.getAmount()<=0){
            throw new RuntimeException("Invalid Payment Amount");
        }
        paymentrepository.save(payment);
    }
    
}
