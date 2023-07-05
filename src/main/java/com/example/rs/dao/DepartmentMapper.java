package com.example.rs.dao;

import com.example.rs.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {
    List<Department> queryDepartment();

    int addDepartment(Department Department);

    int updateDepartment(Department Department);

    int deleteDepartment(String bno);
}
