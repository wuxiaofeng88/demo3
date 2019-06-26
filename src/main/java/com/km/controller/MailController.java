package com.km.controller;
/**
 * Created by asus-pc on 2019/6/26.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MailController
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/26 11:35
 * @Version 1.0
 **/
@RestController
public class MailController {
    @Autowired
    JavaMailSenderImpl mailSender;

    @GetMapping("/sendMail")
    public String sendMail(String message){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("通知-今晚开会！");
        simpleMailMessage.setText("今晚7点30开会！");
        simpleMailMessage.setTo("920302147@qq.com");
        simpleMailMessage.setFrom("1198229050@qq.com");
        mailSender.send(simpleMailMessage);
        System.out.println("邮件发送完成！");
        return "success";
    }
}
