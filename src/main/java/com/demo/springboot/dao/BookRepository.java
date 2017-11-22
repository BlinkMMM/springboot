package com.demo.springboot.dao;

import com.demo.springboot.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hzheng2 on 17-11-22.
 */

public interface BookRepository extends JpaRepository<Book,Integer>{
}
