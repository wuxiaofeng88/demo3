package com.km.OptionalContainer;
/**
 * Created by asus-pc on 2019/9/4.
 */

import com.km.MethodInvocation.Employee;

import java.util.Optional;

/**
 * @ClassName TestOptional
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/9/4 11:11
 * @Version 1.0
 **/
public class TestOptional {
    public static void test1(){
        Optional<Employee> op = Optional.of(new Employee("zhangsan", 11, 12));
        System.out.println(op.get());
    }
    public static void test2(){
        //下面语句会报NullPointerException
        Optional<Employee> op2 = Optional.of(null);
        System.out.println(op2);
    }

    public static void test3(){
        Optional<Object> op3 = Optional.empty();
        System.out.println(op3);
        //下面代码会报No value present错误
        //System.out.println(op3.get());
    }

    public static void test4(){
        Optional<Employee> op = Optional.ofNullable(new Employee("zhangsan", 11, 12));
        System.out.println(op.orElse(new Employee()));
        System.out.println(op.orElse(null));
    }

    public static void test5(){
        Optional<Employee> op = Optional.of(new Employee("田七", 11, 12));
        op = Optional.empty();
        Employee employee = op.orElseGet(() -> new Employee());
        System.out.println(employee);
    }

    public static void test6(){
        Optional<Employee> op = Optional.of(new Employee("田七",11,13));
        System.out.println(op.map((e) -> e.getSalary()).get());
    }
    public static void main(String[] args) {
        test6();
    }
}
