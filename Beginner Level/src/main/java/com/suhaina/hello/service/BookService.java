package com.suhaina.hello.service;
import com.suhaina.hello.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.suhaina.hello.model.Book;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;

    //create 
    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    //read all
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    //read by id
    public Optional<Book> getBookById(long id){
        return bookRepository.findById(id);
    }

    //update
    public Book updatedBook(Long id, Book newData){
        return
        bookRepository.findById(id).map(book ->{
            book.setTitle(newData.getTitle());
        book.setAuthor(newData.getAuthor());
        return bookRepository.save(book);
        })
        .orElseThrow(()->new RuntimeException("Student not found"));
    }

    //delete
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
}
