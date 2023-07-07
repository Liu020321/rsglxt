package com.example.rs.controller;

import com.alibaba.fastjson.JSON;
import com.example.rs.dao.HunyinMapper;
import com.example.rs.pojo.Hunyin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/hunyin")
@RestController
public class HunyinController {
    @Autowired
    private HunyinMapper hunyinMapper;

    @RequestMapping("/query")
    @ResponseBody
    public Object queryHunyin(@RequestParam String yno) {
        List<Hunyin> hunyin=hunyinMapper.queryHunyin(yno);
        String jsonString= JSON.toJSONString(hunyin);
        return jsonString;
    }

    @RequestMapping("/update")
    public String updateHunyin(@RequestBody Hunyin hunyin){
        int result= hunyinMapper.updateHunyin(hunyin);
        if (result==1){
            return "success";
        }else {
            return "fail";
        }
    }
}
