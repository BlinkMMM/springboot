package com.demo.springboot.service.impl;

import com.demo.springboot.service.BookPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service("speaking")
public class BookPointImpl implements BookPoint{
    @Override
    public void speaking() {
        System.out.println("==========切点开始啦==========");
    }
}
