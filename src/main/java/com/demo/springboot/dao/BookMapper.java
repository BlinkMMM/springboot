package com.demo.springboot.dao;

import com.demo.springboot.entity.Book;

import java.util.List;

/**
 * Created by hzheng2 on 17-11-20.
 */
public interface BookMapper {
    Book findBookByName(String name);
    List<Book> findAllBook();
    boolean saveBook(Book book);
    Book deleteBookById(int id);
    Book updateBookById(int id);
}
