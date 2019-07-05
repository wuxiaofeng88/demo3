package com.km.controller;/**
 * Created by asus-pc on 2019/6/17.
 */

import com.km.entities.Employee;
import com.km.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/17 17:59
 * @Version 1.0
 **/
@Controller
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(String user){
        if("aaa".equalsIgnoreCase(user)){
            throw new UserNotExistException();
        }
        return "hello, " + user;
    }

    @RequestMapping("/testEpt")
    @ResponseBody
    public String testEpt(){
        Employee employee = null;
        String email = employee.getEmail();
        return "testEpt is executed!email:" + email;
    }

    @RequestMapping(value = "/hotDeploy")
    @ResponseBody
    public String hotDeploy(){
        return "正在测试热部署功能，测试成功！";
    }
}
