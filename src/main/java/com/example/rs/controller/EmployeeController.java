package com.example.rs.controller;

import com.alibaba.fastjson.JSON;
import com.example.rs.dao.EmployeeMapper;
import com.example.rs.pojo.Department;
import com.example.rs.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/employee")
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping("/query")
    public String queryEmployee() {
        List<Employee> employ = employeeMapper.queryEmployee();
        String jsonString = JSON.toJSONString(employ);
        return jsonString;
    }

    @RequestMapping("/searchXue")
    public String searchXue(@RequestParam String xueli) {
        List<Employee> employ = employeeMapper.searchXue(xueli);
        String jsonString = JSON.toJSONString(employ);
        return jsonString;
    }

    @RequestMapping("/searchHun")
    public String searchHun(@RequestParam String hunyin) {
        List<Employee> employ = employeeMapper.searchHun(hunyin);
        String jsonString = JSON.toJSONString(employ);
        return jsonString;
    }

    @RequestMapping("/searchGang")
    public String searchGang(@RequestParam String gangwei) {
        List<Employee> employ = employeeMapper.searchGang(gangwei);
        String jsonString = JSON.toJSONString(employ);
        return jsonString;
    }

    @RequestMapping("/selectById")
    public String selectById(@RequestParam String yno) {
        List<Employee> employ = employeeMapper.selectById(yno);
        String jsonString = JSON.toJSONString(employ);
        return jsonString;
    }

    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee) {
        int result= employeeMapper.addEmployee(employee);
        if (result == 1){
            return "success";
        }else {
            return "fail";
        }
    }

    @PostMapping("/update")
    public String updateEmployee(@RequestBody Employee employee) {
        int result= employeeMapper.updateEmployee(employee);
        if (result == 1){
            return "success";
        }else {
            return "fail";
        }
    }
    @RequestMapping("/delete")
    @ResponseBody
    public String deleteEmployee(@RequestParam String yno) {
        int result= employeeMapper.deleteEmployee(yno);
        if (result == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("/redirect")
    @ResponseBody
    public String redirect(@RequestParam String yno ) {
        return "success";
    }
}
