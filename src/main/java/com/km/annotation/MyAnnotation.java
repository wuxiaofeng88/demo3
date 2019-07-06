package com.km.annotation;
/**
 * Created by asus-pc on 2019/7/6.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName MyAnnotation
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/6 17:59
 * @Version 1.0
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String city() default "深圳";
    String company() default "华为";
}
