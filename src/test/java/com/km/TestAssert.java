package com.km;/**
 * Created by asus-pc on 2019/5/27.
 */

import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

import java.io.FileNotFoundException;
import java.util.Objects;

/**
 * @ClassName TestAssert
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/5/27 15:34
 * @Version 1.0
 **/
public class TestAssert {
    public static String getURL(String resourceLocation) throws FileNotFoundException{
        Assert.notNull(resourceLocation,"不能为空");
        return "http://" + resourceLocation;
    }
    public static void main(String[] args) {
        /*try {
            System.out.println(getURL(null));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        //System.out.println("hello,world".substring(5));
        Objects.requireNonNull(null);
    }


}
