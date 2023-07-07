package com.example.rs.dao;

import com.example.rs.pojo.Xueli;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Mapper
@Repository
public interface XueliMapper {
    List<Xueli> queryXueli(String yno);
    int updateXueli(Xueli xueli);
}
