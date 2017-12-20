package test;

import com.demo.springboot.Application;
import com.demo.springboot.dao.BookMapper;
import com.demo.springboot.entity.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by hzheng2 on 17-11-22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class Test01 {
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void testFind(){
        Book book = bookMapper.selectByPrimaryKey(1);
        Assert.assertEquals(book.getBookName(),"java从入门到放弃");
    }

    @Test
    public void testSave(){
        Book book = new Book(5,"test5",55.0,"tom3");
        int ok = bookMapper.insert(book);
        System.out.println("==========="+ok);
    }
}
