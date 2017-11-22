package com.demo.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by hzheng2 on 17-11-20.
 * 这里使用mybatis作为持久层，但是不适用xml那种方式
 * 而是使用 @Select("select * from book") 注解方式
 */
@SpringBootApplication
@MapperScan("com.demo.springboot.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        System.out.println("启动成功=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
