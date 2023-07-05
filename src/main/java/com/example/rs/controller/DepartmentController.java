package com.example.rs.controller;

import com.example.rs.dao.DepartmentMapper;
import com.example.rs.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/department")
@RestController
public class DepartmentController {
    @Autowired
    private DepartmentMapper departmentMapper;

//    @RequestMapping("/query")
//    public String queryDepartment(@RequestBody){
//        String depart=queryDepartment();
//        if (depart != null) {
//            return "success";
//        } else {
//            return "fail";
//        }
//
//
//    }
}
