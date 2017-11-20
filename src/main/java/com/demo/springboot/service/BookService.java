package com.demo.springboot.service;

import com.demo.springboot.entity.Book;

import java.util.List;

/**
 * Created by hzheng2 on 17-11-20.
 */
public interface BookService {
    List<Book> findAllBooks();
}
