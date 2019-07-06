package com.km.annotation;
/**
 * Created by asus-pc on 2019/7/6.
 */

import org.springframework.stereotype.Service;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/6 19:46
 * @Version 1.0
 **/
@Service
public class TestService {
    @SMSAndMailSender(smsContent = "MODEL_SUBJECT_SMS",mailContent = "MODEL_SUPPLIER_MAIL", subject = "MODEL_SUBJECT_SUBJECT")
    public String test(String param) throws Exception{
        //int result = 1 / 0;
        System.out.println("int TestService.test() 方法，接受到的参数为：" + param);
        return "success";
    }
}
