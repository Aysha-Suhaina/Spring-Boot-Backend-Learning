package com.example.product_app.model;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import lombok.Data;


@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="name must not be empty ")
    private String name;

    @Min(value=1,message="price must be greater than zero")
    private Double price;

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }

    public void setId(Long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(Double price){
        this.price=price;
    }

}
