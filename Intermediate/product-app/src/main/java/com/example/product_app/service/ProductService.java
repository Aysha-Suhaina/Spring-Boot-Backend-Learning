package com.example.product_app.service;

import java.util.List;
import java.util.Map;

import com.example.product_app.model.Product;

public interface ProductService {

    Product saveProduct(Product product);
    Product getProductById(Long id);
    Product updateProductFields(Long id,Map<String,Object> updates);
    List<Product>getAllProducts();
}