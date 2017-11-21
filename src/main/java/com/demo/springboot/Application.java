package com.demo.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by hzheng2 on 17-11-20.
 */
@SpringBootApplication
@MapperScan("com.demo.springboot.dao")
public class Application {
    public static void main(String[] args) {
        //SpringApplication.run(HelloController.class,args);
        SpringApplication.run(Application.class,args);
        System.out.println("启动成功=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
