package com.km;/**
 * Created by asus-pc on 2019/5/27.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName TestJava8Copy
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/5/27 17:07
 * @Version 1.0
 **/
class Person{
    private String name;
    private String age;
    private String sex;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
public class TestJava8Copy {


    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge("19");
        p1.setSex("male");
        p1.setAddress("2323");
        personList.add(p1);
        Person p2 = new Person();
        p2.setName("李四");
        p2.setAge("19");
        p2.setSex("male");
        p2.setAddress("2323");
        personList.add(p2);
        Person p3 = new Person();
        p3.setName("王五");
        p3.setAge("19");
        p3.setSex("male");
        p3.setAddress("2323");
        personList.add(p3);
        Person p4 = new Person();
        p4.setName("赵丽璐");
        p4.setAge("19");
        p4.setSex("male");
        p4.setAddress("2323");
        personList.add(p4);
        Person p5 = new Person();
        p5.setName("孙琪");
        p5.setAge("19");
        p5.setSex("male");
        p5.setAddress("2323");
        personList.add(p5);
        System.out.println("原始数据集合：" + personList);
        List<String> nameList = personList.stream().map(person -> person.getName()).collect(Collectors.toList());
        System.out.println("只复制姓名后的集合：" + nameList);
        System.out.println(1&2);
    }
}
