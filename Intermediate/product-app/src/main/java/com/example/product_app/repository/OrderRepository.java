package com.example.product_app.repository;
import com.example.product_app.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
//import java.util.List;
    @Repository
    public interface OrderRepository extends JpaRepository<Orders,Long>{
        
    }