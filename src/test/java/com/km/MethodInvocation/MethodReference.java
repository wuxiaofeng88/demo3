package com.km.MethodInvocation;
/**
 * Created by asus-pc on 2019/9/3.
 */

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @ClassName MethodReference
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/9/3 14:06
 * @Version 1.0
 **/
public class MethodReference {
    public static void main(String[] args) {
        Consumer<Integer> con = (x) -> System.out.println(x);
        con.accept(100);

        Consumer<Integer> con2 = System.out::println;
        con2.accept(200);

        BiFunction<Integer, Integer, Integer> biFun = (x, y) -> Integer.compare(x, y);
        BiFunction<Integer, Integer, Integer> biFun2 = Integer::compare;
        Integer result = biFun2.apply(100,200);
        System.out.println(result);

        BiFunction<String, String, Boolean> fun1 = (str1, str2) -> str1.equals(str2);
        BiFunction<String, String, Boolean> fun2 = String::equals;
        Boolean result2 = fun2.apply("hello", "world");
        System.out.println(result2);

        //构造方法引用 类名：：new
        Supplier<Employee> sup = () -> new Employee();
        System.out.println(sup.get());
        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup2.get());

        //数组引用
        Function<Integer, String[]> fun3 = (x) -> new String[x];
        Function<Integer, String[]> fun4 = String[]::new;
        String[] strArray = fun4.apply(10);
        Arrays.stream(strArray).forEach(System.out::println);
    }
}
