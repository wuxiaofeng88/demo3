package com.km.annotation;
/**
 * Created by asus-pc on 2019/7/6.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestServiceController
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/6 19:50
 * @Version 1.0
 **/
@RestController
public class TestServiceController {
    @Autowired
    private TestService testService;

    @RequestMapping("/testService")
    public String testService(String param){
        String result = "";
        try{
            result = testService.test(param);
        }catch (Exception exception){}
        return result;
    }
}
