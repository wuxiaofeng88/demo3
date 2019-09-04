package com.km.MethodInvocation;
/**
 * Created by asus-pc on 2019/9/3.
 */

/**
 * @ClassName Employee
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/9/3 14:34
 * @Version 1.0
 **/
public class Employee {
    private String name;
    private int age;
    private int salary;
    public static String STATUS_BUSY = "busyStatus";
    public Employee(){
        this.name = "张三";
        this.age = 18;
        this.salary = 10000;
    }
    public Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
