package com.km.controller;
/**
 * Created by asus-pc on 2019/7/5.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName StudyController
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/5 20:46
 * @Version 1.0
 **/
@RestController
public class StudyController {
    @RequestMapping("/study")
    public void studyMethod1() {
        System.out.println("in method 1");
    }

    @RequestMapping("/sshello")
    public void sshello(String name) {
        System.out.println("in method sshello :" + name);
    }
}
