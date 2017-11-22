package test;

import com.demo.springboot.Application;
import com.demo.springboot.dao.EmployeeMapper;
import com.demo.springboot.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
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
    EmployeeMapper employeeMapper;

    @Test
    public void testEmployee() {
        Employee employee = employeeMapper.selectByPrimaryKey(1);
        System.out.println(employee.getDeptNo());
    }
}
