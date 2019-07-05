package com.km.controller;
/**
 * Created by asus-pc on 2019/6/26.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @ClassName MailController
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/26 11:35
 * @Version 1.0
 **/
@RestController
public class MailController {
   /* @Autowired
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

    @GetMapping(value = "/sendMultiPartMail")
    public String sendMultiPartMail() throws Exception{
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
        mimeMessageHelper.setSubject("亲爱的！");
        mimeMessageHelper.setText("<b stype='color:red'>亲爱的，送你两张图片，请注意查收!</b>",true);
        mimeMessageHelper.setTo("920302147@qq.com");
        mimeMessageHelper.setFrom("1198229050@qq.com");

        //添加图片
        mimeMessageHelper.addAttachment("1.jpg",new File("D:\\测试用文件\\1.jpg"));
        mimeMessageHelper.addAttachment("2.jpg",new File("D:\\测试用文件\\2.jpg"));
        mailSender.send(mimeMessage);
        System.out.println("邮件发送完成！");
        return "success";
    }*/
}
