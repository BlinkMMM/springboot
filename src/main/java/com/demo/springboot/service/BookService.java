package com.demo.springboot.service;

import com.demo.springboot.entity.Book;

public interface BookService {
    Book findBookById(int bookId);
}
