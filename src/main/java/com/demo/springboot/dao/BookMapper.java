package com.demo.springboot.dao;

import com.demo.springboot.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by hzheng2 on 17-11-20.
 */
@Mapper
public interface BookMapper {
    @Select("select * from book")
    List<Book> findAllBook();
    Book findBookByName(String name);
    boolean saveBook(Book book);
    Book deleteBookById(int id);
    Book updateBookById(int id);
}
