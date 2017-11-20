package com.demo.springboot.service.impl;

import com.demo.springboot.dao.BookMapper;
import com.demo.springboot.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.springboot.service.BookService;

import java.util.List;

/**
 * Created by hzheng2 on 17-11-20.
 */
@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> findAllBooks() {
        return bookMapper.findAllBook();
    }
}
