package com.km.FunctionalInterface;
/**
 * Created by asus-pc on 2019/9/3.
 */

import java.util.function.Consumer;

/**
 * @ClassName ConsumerInterface
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/9/3 11:49
 * @Version 1.0
 **/
public class ConsumerInterface {
    public static void changeStr(String str, Consumer<String> con){
        con.accept(str);
    }
    public static void test(){
        changeStr("hello,world!",(str) -> System.out.println(str));
    }

    public static void main(String[] args) {
        test();
    }
}
