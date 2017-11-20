package com.demo.springboot.controller;

import com.demo.springboot.entity.Book;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hzheng2 on 17-11-20.
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/test")
public class HelloController {
    @RequestMapping("/test1")
    @ResponseBody
    String home(){
        return "zheng han hhhhhh";
    }

    @RequestMapping("/test2")
    @ResponseBody
    Book getBook(){
        return new Book(1,"Java",20,"zh");
    }
}
