package com.example.rs.controller;

import com.alibaba.fastjson.JSON;
import com.example.rs.dao.XueliMapper;
import com.example.rs.pojo.Xueli;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/xueli")
@RestController
public class XueliController {
    @Autowired
    private XueliMapper xueliMapper;

    @RequestMapping("/query")
    @ResponseBody
    public String queryXueli(String yno) {
        List<Xueli> xueli= xueliMapper.queryXueli(yno);
        String jsonString= JSON.toJSONString(xueli);
        return jsonString;
    }

    @RequestMapping("/update")
    public String updateXueli(@RequestBody Xueli xueli){
        int result= xueliMapper.updateXueli(xueli);
        if (result==1){
            return "success";
        }else {
            return "fail";
        }
    }
}
