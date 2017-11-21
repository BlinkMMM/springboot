package com.demo.springboot.controller;

import com.demo.springboot.entity.Book;
import com.demo.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by hzheng2 on 17-11-20.
 */
@Controller
//@EnableAutoConfiguration
@SpringBootApplication
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/showBook")
    @ResponseBody
    List<Book> showBook(){
        return bookService.findAllBooks();
    }
//    @Resource
//    BookMapper bookMapper;
//    @RequestMapping("/showBook1")
//    @ResponseBody
//    String showBook1(){
//        System.out.println(bookMapper.findAllBook());
//        return "xxx";
//    }
}
