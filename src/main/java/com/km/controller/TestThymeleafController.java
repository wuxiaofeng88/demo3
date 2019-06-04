package com.km.controller;/**
 * Created by asus-pc on 2019/5/19.
 */

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @ClassName TestThymeleafController
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/5/19 18:46
 * @Version 1.0
 **/
@Controller
public class TestThymeleafController {
    @RequestMapping("/success2")
    public String success2(){
        return "success";
    }

    @RequestMapping({"/","/index.html"})
    public String index(){
        return "index";
    }

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String, Object> msg, HttpSession session){
        if(!StringUtils.isEmpty(username) && "123456".equalsIgnoreCase(password)){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else {
            msg.put("msg","用户名或者密码错误！");
            return "index";
        }
    }
}
