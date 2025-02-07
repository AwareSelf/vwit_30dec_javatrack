package nama.springboot.usingprofiledemo.controller;

import nama.springboot.usingprofiledemo.exceptions.BookNotFoundException;
import nama.springboot.usingprofiledemo.model.Book;
import nama.springboot.usingprofiledemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookRepository repository;

    // Find
    @GetMapping("/books/{id}")
    Book findOne(@PathVariable Long id) {

        return repository.findById(id);

    }

    //...
}