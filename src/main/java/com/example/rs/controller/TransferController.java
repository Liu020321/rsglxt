package com.example.rs.controller;

import com.alibaba.fastjson.JSON;
import com.example.rs.dao.TransferMapper;
import com.example.rs.pojo.Transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/transfer")
@RestController
public class TransferController {
    @Autowired
    private TransferMapper transferMapper;

    @RequestMapping("/query")
    public String queryTransfer() {
        List<Transfer> transfer = transferMapper.queryTransfer();
        String jsonString = JSON.toJSONString(transfer);
        return jsonString;
    }
    @RequestMapping("/add")
    public String addTransfer(@RequestBody Transfer transfer) {
        transferMapper.insertTransfer(transfer);
        return "success";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String deleteTransfer(@RequestParam String dno) {
        int result=transferMapper.deleteTransfer(dno);
        if (result == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("/update")
    public String updateTransfer(@RequestBody Transfer transfer) {
        int result=transferMapper.updateTransfer(transfer);
        if (result == 1) {
            return "success";
        } else {
            return "fail";
        }
    }
}
