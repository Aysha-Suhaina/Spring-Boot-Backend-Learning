package com.example.product_app.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Async
    public void sendNotification(String message){
        System.out.println("Sending notificaion on thread:" + Thread.currentThread().getName());
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Notification sent:" + message);
    }


}
