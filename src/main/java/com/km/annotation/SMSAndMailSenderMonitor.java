package com.km.annotation;
/**
 * Created by asus-pc on 2019/7/6.
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @ClassName SMSAndMailSenderMonitor
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/6 19:36
 * @Version 1.0
 **/
@Aspect
@Component
public class SMSAndMailSenderMonitor {
    @AfterReturning(value = "@annotation(com.km.annotation.SMSAndMailSender)", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        MethodSignature ms = (MethodSignature)joinPoint.getSignature();
        Method method = ms.getMethod();
        boolean active = method.getAnnotation(SMSAndMailSender.class).isActive();
        if(!active){
            System.out.println("active is false");
            return;
        }
        String smsContent = method.getAnnotation(SMSAndMailSender.class).smsContent();
        String mailContent = method.getAnnotation(SMSAndMailSender.class).mailContent();
        String subject = method.getAnnotation(SMSAndMailSender.class).subject();
        System.out.println("系统在执行" +method.getClass().getPackage() + "包下" + method.getClass().getName() + "类的"+ method.getName() + "方法");
        System.out.println("执行SMSAndMailSenderMonitor的afterReturning方法，获取到的参数分别为:smsContent" + smsContent + ",\tmailContent:" + mailContent + ",\tsubject:" + subject);
    }

    @AfterThrowing(value = "@annotation(com.km.annotation.SMSAndMailSender)", throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Throwable ex){
        MethodSignature ms = (MethodSignature)joinPoint.getSignature();
        Method method = ms.getMethod();
        String smsContent = method.getAnnotation(SMSAndMailSender.class).smsContent();
        String mailContent = method.getAnnotation(SMSAndMailSender.class).mailContent();
        String subject = method.getAnnotation(SMSAndMailSender.class).subject();
        System.out.println("执行SMSAndMailSenderMonitor的afterThrowing方法，获取到的参数分别为:smsContent" + smsContent + ",\tmailContent:" + mailContent + ",\tsubject:" + subject);
    }

    @Around(value="@annotation(com.km.annotation.SMSAndMailSender)")
    public String processReturnValue(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        Object[] args = proceedingJoinPoint.getArgs();
        if (args != null && args.length > 0 && args[0].getClass() == String.class) {
            args[0] = "对传入的参数进行了修改，修改后的参数为" + args[0];
        }
        Object returnValue = proceedingJoinPoint.proceed(args);
        return "返回的结果为:" + returnValue;
    }
}
