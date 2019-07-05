package com.km.advice;
/**
 * Created by asus-pc on 2019/7/5.
 */

/**
 * @ClassName NaiveWaiter
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/5 15:25
 * @Version 1.0
 **/
public class NaiveWaiter implements Waiter{
    @Override
    public void greetTo(String name) {
        System.out.println("greetTo " + name + "\n");
    }

    @Override
    public void serverTo(String name) {
        System.out.println("serverTo " + name);
    }
}
