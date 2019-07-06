package com.km.annotation;
/**
 * Created by asus-pc on 2019/7/6.
 */

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @ClassName MyReflection
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/6 18:04
 * @Version 1.0
 **/
public class MyReflection {
    public static void main(String[] args) throws Exception{
        Class<MyTest> myTestClass = MyTest.class;
        Method method = myTestClass.getMethod("output",new Class[]{});
        if(method.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.city());
            System.out.println(annotation.company());
        }
        System.out.println("------------------------------");
        Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation : annotations){
            System.out.println(annotation.annotationType().getName());
        }
    }
}
