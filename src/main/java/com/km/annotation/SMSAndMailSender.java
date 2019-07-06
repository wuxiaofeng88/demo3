package com.km.annotation;
/**
 * Created by asus-pc on 2019/7/6.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName SMSAndMailSender
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/6 19:34
 * @Version 1.0
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface SMSAndMailSender {
    String value() default "";
    String smsContent() default "";
    String mailContent() default "";
    boolean isActive() default true;
    String subject() default "";
}
