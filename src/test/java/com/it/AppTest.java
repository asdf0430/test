package com.it;

import com.it.domain.Book;
import com.it.impl.ImplClass;
import com.it.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


import java.util.Date;


public class AppTest {

    @Autowired
    private BookService bookService;


    @Value("${supplier}")
    private String supplier;

    @Value("${store}")
    private String store;

    @Value("${warehousing}")
    private boolean warehousing;

    @Value("${settlement_account}")
    private String settlement_account;

    @Value("${paid_in_amount}")
    private Integer paid_in_amount;

    @Value("${arrears}")
    private Integer arrears;

    @Value("${business_date}")
    private Date business_date;

    @Value("${comments}")
    private String comments;



    @Test
    void insertToTable(){
        Book book = new Book();
        book.setSupplier(supplier);
        book.setWarehousing(warehousing);
        book.setPaid_in_amount(paid_in_amount);
        book.setArrears(arrears);
        book.setComments(comments);
        book.setStore(store);
        book.setBusiness_date(business_date);
        book.setSettlement_account(settlement_account);
        boolean insert=bookService.insert(book);

        System.out.println(insert);
    }

}
