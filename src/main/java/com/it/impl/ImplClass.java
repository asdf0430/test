package com.it.impl;



import com.it.domain.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface ImplClass {
    @Select("select * from purchase_order ")
    public List<Book> getAll();

    @Select("select * from purchase_order where id= #{id}")
    public Book getById(Integer id);

    @Select("select * from purchase_order where supplier= #{supplier}")
    public Book getBySupplier(String supplier);

    @Insert("insert into purchase_order (supplier,store,warehosing,settlement_account,paid_in_account,arrears,business_date,comments) " +
            "values (#{supplier},#{store},#{warehosing},#{settlement_account},#{paid_in_account},#{arrears},#{business_date},#{comments})")
    public void insert(Book book);
}
