package com.it.service;

import com.it.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    public boolean insert(Book book);

    public Book getById(Integer id);

    public Book getBySupplier(String supplier);

    public List<Book> getAll();
}
