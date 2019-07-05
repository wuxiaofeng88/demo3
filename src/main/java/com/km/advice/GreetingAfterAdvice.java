package com.km.advice;
/**
 * Created by asus-pc on 2019/7/5.
 */

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

/**
 * @ClassName GreetingAfterAdvice
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/5 16:43
 * @Version 1.0
 **/
public class GreetingAfterAdvice implements AfterReturningAdvice{
    @Override
    public void afterReturning(@Nullable Object o, Method method, Object[] objects, @Nullable Object o1) throws Throwable {
        System.out.println("please enjoy yourself, sir!");
    }
}
