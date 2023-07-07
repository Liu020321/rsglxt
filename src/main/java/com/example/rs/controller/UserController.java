package com.example.rs.controller;

import com.example.rs.dao.UserMapper;
import com.example.rs.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUser")
    @ResponseBody
    public String queryUser(@RequestParam String userName, @RequestParam String password) {
        User user1 = userMapper.queryUser(userName, password);
        int admin= user1.getAdmin();
        if (admin == 1) {
            return "admin";
        } else {
            return "fail";
        }

    }

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user) {
        int flag = userMapper.addUser(user);
        if (flag == 1) {
            return "success";
        } else {
            return "fail";
        }
    }
//
//    @RequestMapping("/updateUser")
//    public String updateUser(User user) {
//        int flag = userMapper.updateUser(user);
//        if (flag == 1) {
//            return "success";
//        } else {
//            return "fail";
//        }
//    }
//
//    @RequestMapping("/deleteUserById")
//    public String deleteUserById(int id) {
//        int flag = userMapper.deleteUserById(id);
//        if (flag == 1) {
//            return "success";
//        } else {
//            return "fail";
//        }
//    }
}
