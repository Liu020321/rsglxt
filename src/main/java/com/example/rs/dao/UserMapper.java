package com.example.rs.dao;

import com.example.rs.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

     User queryUser(String userName, String password);

    int addUser(User user);
//
//    int updateUser(User user);
//
//    int deleteUserById(int id);
}
