package com.example.product_app.service;

import com.example.product_app.repository.ProductRepository;

import org.springframework.cache.annotation.Cacheable;

import com.example.product_app.model.Product;
//import com.example.product_app.service.ProductService;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

//import org.modelmapper.ModelMapper;
//import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
        
    }
    // @Autowired
    // private PasswordEncoder passwordEncoder;

    // public String encodingpassword(String password){
    //     return passwordEncoder.encode(password);
    // }

    // @Autowired
    // private ModelMapper modelMapper;

    // public ProductDto convertTODto(Product product){
    //     return new modelMapper.map(product,ProductDto.class);
    // }
    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Product not found"));
    }


    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    // ✅ ADD THIS METHOD
    @Override
    public Product saveProduct(Product product) {
        System.out.println("Inside saveProduct method: " + product.getName());

        return productRepository.save(product);
    }
    public List<Product> searchByName(String name){
        return productRepository.findByNameContainingIgnoreCase(name);
    }


    @Override
    public Product updateProductFields(Long id,Map<String,Object> updates){
        Product product = productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
        if(updates.containsKey("price")){
            double price=Double.parseDouble(updates.get("price").toString());
            product.setPrice(price);
        }
        if(updates.containsKey("name")){
            product.setName(updates.get("name").toString());
        }
        return productRepository.save(product);
    }
    @Cacheable("products")
    @Override
    public List<Product>getAllProducts(){
        System.out.println("fetching from DB");
        return productRepository.findAll();
    }


}
