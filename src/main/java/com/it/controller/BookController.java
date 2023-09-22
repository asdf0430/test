package com.it.controller;


import com.it.domain.Book;
import com.it.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;


    @PostMapping
    public boolean insert(@RequestBody Book book)
    {
        return bookService.insert(book);
    }



    @GetMapping("/{id}")
    public Book getById(@PathVariable int id)
    {
        return bookService.getById(id);
    }


    @GetMapping
    public List<Book> getAll()
    {
        return bookService.getAll();
    }


}
