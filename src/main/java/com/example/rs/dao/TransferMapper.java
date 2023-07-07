package com.example.rs.dao;

import com.example.rs.pojo.Transfer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TransferMapper {
    List<Transfer> queryTransfer();
    int insertTransfer(Transfer transfer);
    int deleteTransfer(String dno);
    int updateTransfer(Transfer transfer);
}
