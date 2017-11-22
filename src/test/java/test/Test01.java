package test;

import com.demo.springboot.Application;
import com.demo.springboot.dao.BookRepository;
import com.demo.springboot.entity.Book;
import com.demo.springboot.service.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by hzheng2 on 17-11-22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class Test01 {
    @Autowired
    BookService bookService;
    @Autowired
    BookRepository bookRepository;
    @Test
    public void testFindAllBook() {
        List<Book> bookList = bookService.findAllBooks();
        Assert.assertNotNull(bookList);
        Assert.assertEquals(bookList.size(),4);
    }

    @Test
    public void testJpaFindAll(){
        List<Book> bookList = bookRepository.findAll();
        Assert.assertNotNull(bookList);
        Assert.assertEquals(bookList.size(),4);
        System.out.println(bookList);
    }

    @Test
    public void testJpaSave(){
        Book book = new Book(6,"test2",44,"xxx");
        Book book1 = bookRepository.save(book);
//        bookRepository.findAll();
//        bookRepository.findOne(1);
//        bookRepository.save(book);
//        bookRepository.delete(book);
//        bookRepository.count();
//        bookRepository.exists(1);
        System.out.println(book1);
    }
}
