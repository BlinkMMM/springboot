package com.demo.springboot.dao;

import com.demo.springboot.entity.Employee;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer employeeNo);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer employeeNo);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}