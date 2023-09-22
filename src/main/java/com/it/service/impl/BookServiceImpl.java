package com.it.service.impl;

import com.it.domain.Book;
import com.it.impl.ImplClass;
import com.it.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private ImplClass implClass;
    @Override
    public boolean insert(Book book) {
        implClass.insert(book);
        return true;
    }

    @Override
    public Book getById(Integer id) {
        return implClass.getById(id);
    }

    @Override
    public Book getBySupplier(String supplier) {
        return implClass.getBySupplier(supplier);
    }

    @Override
    public List<Book> getAll() {

        return implClass.getAll();
    }
}
