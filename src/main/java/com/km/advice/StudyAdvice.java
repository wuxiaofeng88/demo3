package com.km.advice;
/**
 * Created by asus-pc on 2019/7/5.
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName StudyAdvice
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/5 20:45
 * @Version 1.0
 **/
@Component
@Aspect
public class StudyAdvice {
    @Before(value = "execution(void com.km.controller.*Controller.*Method*())")
    public void before(JoinPoint point) {
        System.out.println("before");
    }
    //在被通知函数返回后执行
    @AfterReturning("execution(void com.km.controller.*Controller.*Method*())")
    public void afterReturning(JoinPoint point) {
        System.out.println("after returning");
    }
    //在被通知函数执行完毕返回之前执行
    @After(value = "execution(void com.km.controller.*Controller.*Method*())")
    public void after(JoinPoint point) {
        System.out.println("after");
    }
    //环绕通知，在被通知函数执行前、后执行
    @Around(value = "execution(void com.km.controller.*Controller.*Method*())")
    public void around(ProceedingJoinPoint point) {
        try {
            System.out.println("around 1");
            point.proceed();//执行被通知函数
            System.out.println("around 2");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
