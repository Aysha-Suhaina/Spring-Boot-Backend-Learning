package com.suhaina.hello.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.suhaina.hello.model.Book;
import java.util.List;

import com.suhaina.hello.service.BookService;


@RestController
@RequestMapping("/books")
public class HelloController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable Long id){
        return bookService.getBookById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Book> create(@RequestBody Book book) {
        return new ResponseEntity<>(bookService.saveBook(book),HttpStatus.CREATED);
    }
    

    @PutMapping("/{id}")
public ResponseEntity<Book> update(@PathVariable Long id, @RequestBody Book updatedBook) {
    return bookService.getBookById(id)
        .map(existingBook -> {

            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());

            Book savedBook = bookService.saveBook(existingBook);
            return ResponseEntity.ok(savedBook);
        })
        .orElse(ResponseEntity.notFound().build());
}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
    

    // public String getItem(@RequestParam(name="name") String itemName){
        // if(itemName==null || itemName.trim().isEmpty()){
        //     throw new ItemNotFoundException("empty input");
        // }
        // if(!itemName.equalsIgnoreCase("pen") && !itemName.equalsIgnoreCase("book")){
        //     throw new ItemNotFoundException(itemName);
        // }
    //     return "You searched for: " + itemName;
    // }
    // public String getuserId(@RequestParam String itemName) {
    //     return "you searched for  :" + itemName;
    // }  RAKSHNA

    // @PostMapping("/create-user")
    // public String createUser(@RequestBody User user){
    //     return "User created: " + user.getName() + "Age: " + user.getAge();}
    //http://localhost:8080/

    }

