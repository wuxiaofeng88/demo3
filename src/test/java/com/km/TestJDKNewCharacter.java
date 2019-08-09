package com.km;
/**
 * Created by asus-pc on 2019/8/9.
 */

import java.util.Arrays;
import java.util.function.Function;

/**
 * @ClassName TestJDKNewCharacter
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/8/9 17:13
 * @Version 1.0
 **/
public class TestJDKNewCharacter
{
    public static void main(String[] args) {
        // 数组引用
        Function<Integer, String[]> fun = (x) -> new String[x];
        Function<Integer, String[]> fun2 = String[]::new;
        String[] strArray = fun2.apply(10);
        Arrays.stream(strArray).forEach(System.out::println);
    }
}
