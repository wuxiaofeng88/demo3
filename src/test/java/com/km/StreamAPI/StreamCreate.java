package com.km.StreamAPI;
/**
 * Created by asus-pc on 2019/9/3.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ClassName StreamCreate
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/9/3 15:44
 * @Version 1.0
 **/
public class StreamCreate {
    public static void main(String[] args) {
        //1、通过Collection系列集合提供的Stream()或者paralleStream（）
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        //2、通过Arrays的静态方法stream()获取数组流
        String[] str = new String[10];
        Stream<String> stream2 = Arrays.stream(str);

        //3、通过Stream类中的静态方法of
        Stream<String> stream3 = Stream.of("aa","bb","cc","hello","wolrd","keep calm","just do it");
        //System.out.println(stream3.count());
        stream3.filter(e -> e.length() > 2).limit(3).forEach(System.out::println);


        //4、创建无限流
        Stream<Integer> stream4 = Stream.iterate(0, (x) -> x + 2);

        //生成
        Stream.generate(() -> Math.random());

        //reduce:规约操作
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer count2 = list1.stream().reduce(0, (x,y) -> x + y);
        System.out.println("count2: " + count2);
    }
}
