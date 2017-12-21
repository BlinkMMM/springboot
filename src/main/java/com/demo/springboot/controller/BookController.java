package com.demo.springboot.controller;

import com.demo.springboot.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.demo.springboot.service.BookService;

@Controller
@EnableAutoConfiguration
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping("/findByBookId")
    @ResponseBody
    public Book showBookById(){
        return bookService.findBookById(1);
    }


}
