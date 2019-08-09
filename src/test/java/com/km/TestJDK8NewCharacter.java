package com.km;
/**
 * Created by asus-pc on 2019/8/4.
 */

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @ClassName TestJDK8NewCharacter
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/8/4 17:35
 * @Version 1.0
 **/
public class TestJDK8NewCharacter {
    public static void main(String[] args) {

        Comparator<Integer> cpt = (x,y) -> Integer.compare(x,y);
        TreeSet<Integer> set = new TreeSet<>(cpt);
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(2);
        System.out.println(set);



    }

}
