package com.example.rs.dao;

import com.example.rs.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    List<Employee> queryEmployee();

    List<Employee> selectById(String yno);

    int addEmployee(Employee employee);

    int updateEmployee(Employee employee);

    int deleteEmployee(String yno);

    List<Employee> searchXue(String xueli);
    List<Employee> searchHun(String hunyin);
    List<Employee> searchGang(String gangwei);


}
