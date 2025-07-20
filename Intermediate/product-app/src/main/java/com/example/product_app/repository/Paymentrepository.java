package com.example.product_app.repository;
import com.example.product_app.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
//import java.util.List;
    @Repository
    public interface Paymentrepository extends JpaRepository<Payment,Long>{
        
    }
