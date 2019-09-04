package com.km;
/**
 * Created by asus-pc on 2019/8/25.
 */

import java.util.Scanner;

/**
 * @ClassName Main
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/8/25 11:37
 * @Version 1.0
 **/
public class Main {
    public static int calcRemainMoney(int initialMoney,int price, int predictDays, int actDays){
        if(price < 0 || initialMoney < price || initialMoney <= 0 || predictDays < 0 || actDays <= 0){
            return initialMoney;
        }
        boolean overPrice = false;
        if(price >= 100){
            if(actDays <= 15){
                initialMoney -= 5 * actDays;
            }else{
                if(3*(actDays - 15) >= price - 75){
                    initialMoney -= price;
                    overPrice = true;
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
                    overPrice = true;
                }else {
                    initialMoney -= 3 * 15;
                    initialMoney -= (actDays - 15)*2;
                }
            }
        }else{
            if(price <= actDays){
                initialMoney -= price;
                overPrice = true;
            }else {
                initialMoney -= actDays;
            }
        }
        if(predictDays < actDays && !overPrice){
            initialMoney -= (actDays - predictDays);
        }
        return initialMoney < 0 ? 0: initialMoney;
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
    }
}
