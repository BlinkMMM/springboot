package com.demo.springboot.controller;

import com.demo.springboot.dao.BookMapper;
import com.demo.springboot.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.demo.springboot.service.BookService;

import java.util.List;

/**
 * Created by hzheng2 on 17-11-20.
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private BookMapper bookMapper;

    @RequestMapping("/showBook")
    @ResponseBody
    List<Book> showBook(){
        return bookMapper.findAllBook();
    }

    @RequestMapping("/showBook1")
    @ResponseBody
    String showBook1(){
        return "xxx";
    }
}
