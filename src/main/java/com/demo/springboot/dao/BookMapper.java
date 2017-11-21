package com.demo.springboot.dao;

import com.demo.springboot.entity.Book;

import java.util.List;

/**
 * Created by hzheng2 on 17-11-20.
 */
//@Mapper
//@Repository
//@Component(value = "bookMapper")
public interface BookMapper {
    Book findBookByName(String name);
    //@Select("select * from book")
    List<Book> findAllBook();
    boolean saveBook(Book book);
    Book deleteBookById(int id);
    Book updateBookById(int id);
}
