package com.example.product_app.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

// import com.example.product_app.service.OrderService;
//import com.example.product_app.model.Orders;
// import com.example.product_app.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.product_app.DTO.OrderRequest;
import com.example.product_app.model.Orders;
import com.example.product_app.model.User;
import com.example.product_app.repository.OrderRepository;
import com.example.product_app.repository.UserRepository;

import org.springframework.web.bind.annotation.RequestBody;
// import com.example.product_app.DTO.OrderRequest;
import com.example.product_app.service.NotificationService;


@RestController
@RequestMapping("/orders")
public class OrderController {
    
    // @Autowired 
    // private OrderService orderService;

    // @PostMapping
    // public ResponseEntity<String> placeOrder(@RequestBody OrderRequest request) {
    //     System.out.println(">>> place order function called ");
    //     Orders order=new Orders(null,request.getProduct(),request.getQuantity(),request.getAmount());
    //     Payment payment=new Payment(null,request.getMethod(),request.getAmount());
    //     orderService.placeOrder(order, payment);
    //     return ResponseEntity.ok("order placed successfully!!");
    //     //return ResponseEntity.ok("recieved product:" + request.getProduct());
    // }

    @GetMapping("/ping")
    public ResponseEntity<String> ping(){
        return ResponseEntity.ok("app is alive!");
    }    

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/notification")
    public ResponseEntity<String> testAsync(){
        System.out.println("request recieved on thread" + Thread.currentThread().getName());
        notificationService.sendNotification("Order recieved successully");
        return ResponseEntity.ok("Notification process started");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orders> getOrdersById(@PathVariable Long id){
        Orders order=orderRepository.findById(id).orElseThrow(()-> new RuntimeException("Order not found"));
        return ResponseEntity.ok(order);
    }

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody OrderRequest orderRequest) {
        // For example purposes, let’s assume the user is already known (e.g., user with id 1)
        Long userId = 1L; // replace with actual logic (e.g., from JWT or session)
        Optional<User> optionalUser = userRepository.findById(userId);

        if (!optionalUser.isPresent()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User not found");
        }

        User user = optionalUser.get();

        Orders order = new Orders();
        order.setProduct(orderRequest.getProduct());
        order.setQuantity(orderRequest.getQuantity());
        order.setAmount(orderRequest.getAmount());
        order.setUser(user); // setting the user object

        orderRepository.save(order);

        return ResponseEntity.status(HttpStatus.CREATED).body("Order created successfully");
    }
}
