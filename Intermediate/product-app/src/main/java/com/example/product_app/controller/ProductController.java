package com.example.product_app.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.*;
import com.example.product_app.model.Product;
import com.example.product_app.service.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product savedProduct = productService.saveProduct(product);
        System.out.println("POST request received with product: " + product);

        return ResponseEntity.ok(savedProduct);
    }

    @PostMapping("/products")
    public Product createnewProduct(@Valid @RequestBody Product product){
        return productService.saveProduct(product);
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public String deleteproduct(@PathVariable Long id){
        return "Product "+ id + "deleted successfully";
    }

    @GetMapping()
    public Page<Product> getAllProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "true") boolean ascending
    ) {
        Sort sort = ascending ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return productService.findAll(pageable);
    }

    @GetMapping("/search")
    public List<Product> searchByName(@RequestParam String name){
        return productService.searchByName(name);
    }


    @PatchMapping("/{id}")
    public Product updateProductFields(@PathVariable Long id,@RequestBody Map <String,Object> updates){
        return productService.updateProductFields(id,updates);
    }
    @GetMapping("/hello-admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String helloAdmin(){
        return "Wlecome,Admin!!";
    }

    @GetMapping("/hello-user")
    @PreAuthorize("hasRole('USER')")
    public String helloUser(){
        return "Wlecome,User!!";
    }

    @GetMapping("/ping")
    public String ping(){
        return "Server is up!!!";
    }

    // @GetMapping("/encode-password")
    //     public ResponseEntity<String> getEncodedPassword(@RequestParam String password ){
    //         String encodedpw=productService.encodingpassword(password);
    //         return ResponseEntity.ok(encodedpw);
    //     }
    // @GetMapping("/{id}"){
    //     public ProductDto getProductById(@PathVariable Long id){
    //         Product product=productService.getProductById(id);
    //         return productService.convertToDto(product)
    //     }
    // }

    @GetMapping("/save-products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
