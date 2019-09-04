package com.km.FunctionalInterface;
/**
 * Created by asus-pc on 2019/9/3.
 */

import java.util.function.Function;

/**
 * @ClassName FunctionInterface
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/9/3 13:48
 * @Version 1.0
 **/
public class FunctionInterface {
    public static Long changeNum(Long num, Function<Long, Long> fun){
        return fun.apply(num);
    }
    public static void test(){
        Long result = changeNum(100L,(x) -> x + 200L);
        System.out.println("result: " + result);
    }

    public static void main(String[] args) {
        test();
    }
}
