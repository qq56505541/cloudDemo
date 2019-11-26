package com.nash.cloudDemo.login.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/user/userLoginAction")
public class UserLoginAction {
    
    @PostMapping("userLoginAction.do")
    public String execute(@RequestParam("username") String username ,
                          @RequestParam("password") String password ,
                          Map<String,Object> map,
                          HttpSession session) throws Exception{
        if(!StringUtils.isEmpty(username) && "1".equals(password)){
            session.setAttribute("user",username);
            return "redirect:/main.html";
        }else{
            map.put("msg","登录失败");
            return "login";
        }
    }
}
