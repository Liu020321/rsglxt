package com.example.rs.dao;

import com.example.rs.pojo.Hunyin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HunyinMapper {
    List<Hunyin> queryHunyin(String yno);

    int updateHunyin(Hunyin hunyin);
}
