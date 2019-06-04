package com.km;/**
 * Created by asus-pc on 2019/5/28.
 */

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestStringUtils
 * @Description TODO1
 * @Author wujiancai
 * @Date 2019/5/28 17:37
 * @Version 1.0
 **/
public class TestStringUtils {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhaoliu");
        System.out.println(list);
    }
}
