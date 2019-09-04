package com.km.FunctionalInterface;
/**
 * Created by asus-pc on 2019/9/3.
 */

import java.util.function.Predicate;

/**
 * @ClassName PredicateInterface
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/9/3 13:52
 * @Version 1.0
 **/
public class PredicateInterface {
    public static boolean changeBoolean(String str, Predicate<String> pre){
        return pre.test(str);
    }
    public static void test(){
        boolean result = changeBoolean("hello", (str) -> str.length() > 5);
        System.out.println("逻辑表达式的结果为： " + result);
    }

    public static void main(String[] args) {
        test();
    }
}
