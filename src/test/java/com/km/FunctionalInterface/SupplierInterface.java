package com.km.FunctionalInterface;
/**
 * Created by asus-pc on 2019/9/3.
 */

import java.util.function.Supplier;

/**
 * @ClassName SupplierInterface
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/9/3 13:44
 * @Version 1.0
 **/
public class SupplierInterface {
    public static String getValue(Supplier<String> sup){
        return sup.get();
    }
    public static void test(){
        String value = getValue(() -> "hello");
        System.out.println(value);
    }

    public static void main(String[] args) {
        test();
    }
}
