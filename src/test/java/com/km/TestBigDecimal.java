package com.km;
/**
 * Created by asus-pc on 2019/8/7.
 */

import java.math.BigDecimal;

/**
 * @ClassName TestBigDecimal
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/8/7 17:51
 * @Version 1.0
 **/
public class TestBigDecimal {
    public static void main(String[] args) {
        BigDecimal bg1 = new BigDecimal(12.03);
        BigDecimal bg2 = new BigDecimal(10.03);
        System.out.println(bg1.add(bg2).floatValue());
        BigDecimal bg3 = new BigDecimal(Double.toString(2.3523));
        System.out.println(bg3);

    }
}
