package com.km;
/**
 * Created by asus-pc on 2019/8/7.
 */

import com.km.entities.Employee;
import jdk.nashorn.internal.ir.FunctionNode;
import org.junit.*;
import org.junit.Test;

import java.util.function.*;

/**
 * @ClassName PlainTest
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/8/7 17:44
 * @Version 1.0
 **/
public class PlainTest {
    //1、Consumer<T> 消费型接口,有参无返回值
    public void changeStr(String str, Consumer<String> con){
        con.accept(str + ",world");
    }
    @Test
    public void test(){
        changeStr("hello", (str) -> System.out.println(str));
    }

    //2、Complier<T>:供给型接口,无参数有返回值
    public String getValue(Supplier<String> sup){
        return sup.get();
    }
    public void testSumplier(){
        String value = getValue(() -> "hello!");
        System.out.println(value);
    }

    //3、Function<T,R>:函数式接口，有参数有返回值
    public Long changeNum(Long num, Function<Long,Long> func){
        return func.apply(num);
    }
    public void testFunction(){
        Long result = changeNum(100L,(x) -> x + 200L);
        System.out.println(result);
    }

    //4、Predicate<T>：断言型接口，有参数有返回值,返回值是boolean类型
    public boolean changeBoolean(String str, Predicate<String> pre){
        return pre.test(str);
    }
    public void testPredicate(){
        boolean result = changeBoolean("hello,world!",(str) -> str.length() > 5);
        System.out.println(result);
    }

    public static void main(String[] args) {
        //new PlainTest().testPredicate();

        Consumer<Integer> con = (x) -> System.out.println(x);
        con.accept(100);

        //(a) 方法引用
        Consumer<Integer> con2 = System.out::println;
        con2.accept(200);

        //(a) 方法引用
        BiFunction<Integer,Integer,Integer> biFun = (x, y) -> Integer.compare(x,y);
        BiFunction<Integer,Integer,Integer> biFun2 = Integer::compare;
        Integer result = biFun2.apply(100,200);
        System.out.println("biFun2.apply(100,200): \t" + result);

        //(a) 方法引用
        BiFunction<String, String, Boolean> fun1 = (x, y) -> x.equalsIgnoreCase(y);
        BiFunction<String, String, Boolean> fun2 = String::equals;
        Boolean result2 = fun2.apply("hello","world");
        System.out.println("fun2.apply(\"hello\",\"world\"):\t" + result2);

        //(b)构造器引用
        Supplier<Product> sup = () -> new Product("red",100);
        System.out.println(sup.get());
        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup2.get());

        // 构造方法引用 类名::new （带一个参数）
        Function<String, Product> fun = (x) -> new Product(x);
        System.out.println(fun.apply("green"));
        Function<String, Product> fun12 = Product::new;
        System.out.println(fun12.apply("yellow"));

    }
}
