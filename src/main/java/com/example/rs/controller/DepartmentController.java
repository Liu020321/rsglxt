package com.example.rs.controller;

import com.alibaba.fastjson.JSON;
import com.example.rs.dao.DepartmentMapper;
import com.example.rs.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/department")
@RestController
public class DepartmentController {
    @Autowired
    private DepartmentMapper departmentMapper;

    @RequestMapping("/query")
    public String queryDepartment() {
        List<Department> depart = departmentMapper.queryDepartment();
        String jsonString = JSON.toJSONString(depart);
        return jsonString;
    }


    @PostMapping("/add")
    public String addDepartment(@RequestBody Department department) {
        System.out.println(department);
        int result = departmentMapper.addDepartment(department);
        if (result == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("/update")
    public String updateDepartment(@RequestBody Department department) {
        System.out.println(department);
        int result = departmentMapper.updateDepartment(department);
        if (result == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String deleteDepartment(@RequestParam String bno) {
        System.out.println(bno);
        int result = departmentMapper.deleteDepartment(bno);
        if (result == 1) {
            return "success";
        } else {
            return "fail";
        }
    }
}
