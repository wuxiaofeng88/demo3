package com.km.animal;
/**
 * Created by asus-pc on 2019/7/12.
 */

import com.km.interfaces.IShout;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/12 18:57
 * @Version 1.0
 **/
public class Cat implements IShout{
    @Override
    public void shout() {
        System.out.println("miao miao");
    }
}
