package com.km.advice;
/**
 * Created by asus-pc on 2019/7/5.
 */

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @ClassName BeforceAdviceTest
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/5 15:28
 * @Version 1.0
 **/
public class BeforceAdviceTest {
    public static void main(String[] args) {
        Waiter waiter = new NaiveWaiter();
        BeforeAdvice beforeAdvice = new GreetingBeforeAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(waiter);
        proxyFactory.addAdvice(beforeAdvice);
        Waiter proxy = (Waiter)proxyFactory.getProxy();
        proxy.greetTo("wuxiaofeng");
        proxy.serverTo("Gongjiang");
    }
}
