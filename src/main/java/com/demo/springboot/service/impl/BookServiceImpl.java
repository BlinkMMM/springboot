package com.demo.springboot.service.impl;

import com.demo.springboot.dao.BookMapper;
import com.demo.springboot.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.springboot.service.BookService;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book findBookById(int bookId) {
        return bookMapper.selectByPrimaryKey(bookId);
    }
}
