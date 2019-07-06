package com.km.advice;
/**
 * Created by asus-pc on 2019/7/5.
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @ClassName AdviceTest
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/5 18:01
 * @Version 1.0
 **/
@Configuration
@Aspect
public class AdviceTest {
    @Around(value = "execution(public * com.km.controller.*.*(..))")
    public Object process(ProceedingJoinPoint point) throws Throwable {
        System.out.println("@Around：执行目标方法之前...");
        //访问目标方法的参数：
        Object[] args = point.getArgs();
        if (args != null && args.length > 0 && args[0].getClass() == String.class) {
            args[0] = "改变后的参数1";
        }
        //用改变后的参数执行目标方法
        System.out.println("即将执行point.proceed(args)方法！");
        Object returnValue = point.proceed(args);
        System.out.println("@Around：执行目标方法之后...");
        System.out.println("@Around：被织入的目标对象为：" + point.getTarget());
        return "原返回值：" + returnValue + "，这是返回结果的后缀";
    }

    //@Before("execution(* com.abc.service.*.many*(..))")
    @Before("execution(public * com.km.controller.*.*(..))")
    public void permissionCheck(JoinPoint point) {
        System.out.println("@Before：模拟权限检查...");
        System.out.println("@Before：目标方法为：" +
                point.getSignature().getDeclaringTypeName() +
                "." + point.getSignature().getName());
        System.out.println("@Before：参数为：" + Arrays.toString(point.getArgs()));
        System.out.println("@Before：被织入的目标对象为：" + point.getTarget());
    }

   // @AfterReturning(pointcut="execution(* com.abc.service.*.many*(..))", returning="returnValue")
    @AfterReturning(pointcut="execution(public * com.km.controller.*.*(..))", returning="returnValue")
    public void log(JoinPoint point, Object returnValue) {
        System.out.println("@AfterReturning：模拟日志记录功能...");
        System.out.println("@AfterReturning：目标方法为：" +
                point.getSignature().getDeclaringTypeName() +
                "." + point.getSignature().getName());
        System.out.println("@AfterReturning：参数为：" +
                Arrays.toString(point.getArgs()));
        System.out.println("@AfterReturning：返回值为：" + returnValue);
        System.out.println("@AfterReturning：被织入的目标对象为：" + point.getTarget());

    }

   // @After("execution(* com.abc.service.*.many*(..))")
    @After("execution(public * com.km.controller.*.*(..))")
    public void releaseResource(JoinPoint point) {
        System.out.println("@After：模拟释放资源...");
        System.out.println("@After：目标方法为：" +
                point.getSignature().getDeclaringTypeName() +
                "." + point.getSignature().getName());
        System.out.println("@After：参数为：" + Arrays.toString(point.getArgs()));
        System.out.println("@After：被织入的目标对象为：" + point.getTarget());
    }
}
