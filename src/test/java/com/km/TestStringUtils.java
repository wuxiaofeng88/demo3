package com.km;/**
 * Created by asus-pc on 2019/5/28.
 */

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestStringUtils
 * @Description
 * @Author wujiancai
 * @Date 2019/6/9 23:41
 * @Version 1.0
 **/
public class TestStringUtils {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhaoliu");
        list.add("sunqi");
        list.add("liba");
        list.add("qianjiu");
        list.add("wangshi");
        System.out.println(list);
    }
}
