package com.km.controller;/**
 * Created by asus-pc on 2019/5/19.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
