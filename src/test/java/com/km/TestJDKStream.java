package com.km;
/**
 * Created by asus-pc on 2019/8/9.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ClassName TestJDKStream
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/8/9 17:41
 * @Version 1.0
 **/
public class TestJDKStream {
    public static void main(String[] args) {
        // 1，校验通过Collection 系列集合提供的stream()或者paralleStream()
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
        System.out.println(stream1);

        //2.通过Arrays的静态方法stream()获取数组流
        String[] str = new String[10];
        Stream<String> stream2 = Arrays.stream(str);
        System.out.println(stream2);

        // 3.通过Stream类中的静态方法of
        Stream<String> stream3 = Stream.of("aa","bb","cc");
        stream3.forEach(System.out::println);

        // 4.创建无限流
        // 迭代
        /*Stream<Integer> stream4 = Stream.iterate(0,(x) -> x+2);
        stream4.forEach(System.out::println);*/

        //生成
        Stream.generate(() -> Math.random());
    }
}
