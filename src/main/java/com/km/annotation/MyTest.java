package com.km.annotation;
/**
 * Created by asus-pc on 2019/7/6.
 */

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/6 18:02
 * @Version 1.0
 **/
public class MyTest {
    @MyAnnotation(city = "北京", company = "百度")
    public void output(){
        System.out.println("method output is running");
    }
}
