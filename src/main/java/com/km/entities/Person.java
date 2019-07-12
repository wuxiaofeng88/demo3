package com.km.entities;
/**
 * Created by asus-pc on 2019/7/11.
 */

import javax.validation.Valid;

/**
 * @ClassName Person
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/11 10:43
 * @Version 1.0
 **/
public class Person {
    private String name;
    private int age;
    private String sex;
    private String telephone;
    private String address;

    public Person(String name, int age, String sex, String telephone, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.telephone = telephone;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
