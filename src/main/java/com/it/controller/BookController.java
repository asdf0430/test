package com.it.controller;


import com.it.domain.Book;
import com.it.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;


    @PostMapping
    @ResponseBody
    public boolean insert(@PathVariable Book book)
    {
        return bookService.insert(book);
    }


    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id)
    {
        return bookService.getById(id);
    }

    @GetMapping("/{supplier}")
    public Book getBySupplier(@PathVariable String supplier)
    {
        return bookService.getBySupplier(supplier);
    }


}
