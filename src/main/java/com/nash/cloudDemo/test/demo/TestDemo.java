package com.nash.cloudDemo.test.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("test/testDemo")
public class TestDemo {
    
    @RequestMapping("success.do")
    public String success(Map<String,Object> map) throws Exception{
        
        map.put("hello","allright");
        
        return "success";
    }
}
