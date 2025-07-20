package com.example.product_app.repository;
import com.example.product_app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
    @Repository
    public interface ProductRepository extends JpaRepository<Product,Long>{
        List<Product> findByNameContainingIgnoreCase(String name);
    }

