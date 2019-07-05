package com.km.advice;
/**
 * Created by asus-pc on 2019/7/5.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName BeforceAdivceByXmlTest
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/5 16:34
 * @Version 1.0
 **/
public class BeforceAdivceByXmlTest {
    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("classpath:beforeAdviceBean.xml");
        Waiter waiter = act.getBean("waiter", Waiter.class);
        waiter.greetTo("wuxiaofeng");
        waiter.serverTo("take it easy");
    }
}
