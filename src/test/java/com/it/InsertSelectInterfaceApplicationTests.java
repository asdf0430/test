package com.it;

import com.it.domain.Book;
import com.it.impl.ImplClass;
import com.it.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

@SpringBootTest
class InsertSelectInterfaceApplicationTests {

    @Autowired
    private BookService service;

    @Test
    void contextLoads() {
        List<Book> bookList = service.getAll();
        System.out.println(bookList);
    }


    @Test
    void getById() {
        Book book = service.getBySupplier("深圳服装厂");
        System.out.println(book);
    }


}
