package com.humanresources.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.humanresources.bean.Employees;
import com.humanresources.bean.EmployeesEx;
import com.humanresources.bean.EmployeesExample;

public interface EmployeesMapper {
    int countByExample(EmployeesExample example);

    int deleteByExample(EmployeesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Employees record);

    int insertSelective(Employees record);

    List<Employees> selectByExample(EmployeesExample example);

    Employees selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Employees record, @Param("example") EmployeesExample example);

    int updateByExample(@Param("record") Employees record, @Param("example") EmployeesExample example);

    int updateByPrimaryKeySelective(Employees record);

    int updateByPrimaryKey(Employees record);
    List<EmployeesEx> findAllEmployees();
    Employees findemployeeById(int id);
    
}