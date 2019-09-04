package com.km;
/**
 * Created by asus-pc on 2019/8/25.
 */

import java.util.Scanner;

/**
 * @ClassName CountRemainMoney
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/8/25 10:53
 * @Version 1.0
 **/
public class CountRemainMoney {
    /*public static int calcRemainMoney(int initialMoney,int price, int predictDays, int actDays){
        if(initialMoney < price || initialMoney <= 0  || actDays <= 0){
            return initialMoney;
        }
        if(price >= 100){
            if(actDays <= 15){
                initialMoney -= 5 * actDays;
            }else{
                if(3*(actDays - 15) >= price - 75){
                    initialMoney -= price;
                }else {
                    initialMoney -= 5 * 15;
                    initialMoney -= (actDays - 15)*3;
                }
            }
        }else if(price >= 50 && price < 100){
            if(actDays <= 15){
                initialMoney -= 3 * actDays;
            }else {
                if(2*(actDays - 15) >= price - 45){
                    initialMoney -= price;
                }else {
                    initialMoney -= 3 * 15;
                    initialMoney -= (actDays - 15)*2;
                }
            }
        }else{
            if(price <= actDays){
                initialMoney -= price;
            }else {
                initialMoney -= actDays;
            }
        }
        if(predictDays < actDays){
            initialMoney -= (actDays - predictDays);
        }
        return initialMoney;
    }
    public static void main(String[] args) {
        int initialMoney = 300;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine() && initialMoney > 0){
            String str = (String) sc.nextLine();
            String[] strs = str.split(",");
            int price = Integer.parseInt(strs[0]);
            int predictDays = Integer.parseInt(strs[1]);
            int actDays = Integer.parseInt(strs[2]);
            initialMoney = calcRemainMoney(initialMoney,price,predictDays,actDays);
            System.out.println(initialMoney);
        }
    }*/
}
