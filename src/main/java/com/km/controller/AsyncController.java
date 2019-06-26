package com.km.controller;
/**
 * Created by asus-pc on 2019/6/26.
 */

import com.km.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AsyncController
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/26 10:07
 * @Version 1.0
 **/
@RestController
public class AsyncController {
    @Autowired
    AsyncService asyncService;

    @GetMapping("/testAsynService")
    public String testAsynService(){
        asyncService.sayHello();
        return "success";
    }
}
