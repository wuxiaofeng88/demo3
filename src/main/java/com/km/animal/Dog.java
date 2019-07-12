package com.km.animal;
/**
 * Created by asus-pc on 2019/7/12.
 */

import com.km.interfaces.IShout;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/12 18:58
 * @Version 1.0
 **/
public class Dog implements IShout{
    @Override
    public void shout() {
        System.out.println("wang wang!");
    }
}
