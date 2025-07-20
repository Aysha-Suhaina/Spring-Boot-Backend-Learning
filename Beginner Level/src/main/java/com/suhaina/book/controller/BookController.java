package com.suhaina.book.controller;

import com.suhaina.book.service.BookService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class BookController{

    @Autowired
    private BookService bookService;


    public BookController(BookService bookService){
        this.bookService=bookService;
    }
    @GetMapping("/book-recommendation")
    public String getRecommendation(){
     return bookService.recommendBook();
    }

    @GetMapping("/config")
    public String getConfig() {
        return bookService.getBookConfig();
    }
    
}
//http://localhost:8080/
// @RestController
// @RequestMapping("/books")
// public class BookController {

//     private List<Book> books = new ArrayList<>(List.of(
//         new Book(1, "The Alchemist", "Paulo Coelho"),
//         new Book(2, "Atomic Habits", "James Clear")
//     ));

//     @GetMapping("/{id}")
//     public Book getBookById(@PathVariable int id) {
//         return books.stream()
//                 .filter(book -> book.getId() == id)
//                 .findFirst()
//                 .orElseThrow(() -> new BookNotFoundException("Book with ID " + id + " not found"));
//     }
