package com.suhaina.book.service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class BookService {
    @PostConstruct
    public void init(){
        System.out.println("Book service created");
    }
    public String recommendBook(){
        return "Spring Boot in Action";
    }
    @PreDestroy
    public void cleanUp(){
        System.out.println("Book service destroyed");
    }

    @Value("${app.default.book}")
    private String defaultbook;
    @Value("${app.max.books}")
    private int maxbooks;
    @Value("${app.feature.tax.enabes:false}")
    private boolean isTacEnabled;

    public String getBookConfig(){
        return String.format("default book is: %s | Max books count is :%s | Tax enabled: %s",defaultbook ,maxbooks,isTacEnabled);
    }
}
