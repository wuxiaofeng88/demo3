package com.km.advice;
/**
 * Created by asus-pc on 2019/7/5.
 */

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

/**
 * @ClassName GreetingBeforeAdvice
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/5 15:27
 * @Version 1.0
 **/
public class GreetingBeforeAdvice implements MethodBeforeAdvice{
    @Override
    public void before(Method method, Object[] objects, @Nullable Object o) throws Throwable {
        String clientName = (String) objects[0];
        System.out.println("How are you " + clientName + " ?");
    }
}
