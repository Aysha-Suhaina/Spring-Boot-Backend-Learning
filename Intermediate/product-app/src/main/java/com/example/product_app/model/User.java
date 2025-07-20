package com.example.product_app.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.CascadeType;
import java.util.List;
import java.util.ArrayList;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy="user",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JsonManagedReference
    private List<Orders> orders=new ArrayList<>();

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
       
    }
     public String getName(){
            return name;
        }
    public void setName(String name){
        this.name=name;
    }

    public List<Orders> getOrders(){
        return orders;
    }

    public void setOrders(List<Orders> orders){
        this.orders=orders;
    }
}
