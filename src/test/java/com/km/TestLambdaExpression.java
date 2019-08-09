package com.km;
/**
 * Created by asus-pc on 2019/8/4.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestLambdaExpression
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/8/4 17:54
 * @Version 1.0
 **/
public class TestLambdaExpression {
    public static ArrayList<Product> initialProducts(){
        ArrayList<Product> resultList = new ArrayList<Product>();
        Product pdt1 = new Product("红色",40);
        resultList.add(pdt1);
        Product pdt2 = new Product("黄色",140);
        resultList.add(pdt2);
        Product pdt3 = new Product("绿色",70);
        resultList.add(pdt3);
        Product pdt4 = new Product("蓝色",40);
        resultList.add(pdt4);
        Product pdt5 = new Product("红色",140);
        resultList.add(pdt5);
        Product pdt6 = new Product("红色",100);
        resultList.add(pdt6);
        Product pdt7 = new Product("红色",20);
        resultList.add(pdt7);
        Product pdt8 = new Product("黄色",40);
        resultList.add(pdt8);
        Product pdt9 = new Product("绿色",100);
        resultList.add(pdt9);
        Product pdt10 = new Product("黄色",80);
        resultList.add(pdt10);
        return resultList;
    }

    public static List<Product> filterProductByPredicate(List<Product> list, ProducePredicate<Product> predicator){
        List<Product> resultList = new ArrayList<Product>();
        for(Product product : list){
            if(predicator.test(product))
                resultList.add(product);
        }
        return resultList;
    }

    public static void main(String[] args) {
        //1、通过lambda表达式完成筛选操作
        List<Product> products1 = filterProductByPredicate(initialProducts(),(p) -> p.getPrice() < 100);
        List<Product> products = filterProductByPredicate(products1,(p) -> p.getColor().equalsIgnoreCase("黄色"));
        for(Product product : products){
            System.out.println(product);
        }

        //2、通过Stream API完成筛选操作
        System.out.println("============2、通过Stream API完成筛选操作=================");
        List<Product> products2 = initialProducts();
        System.out.println("进行价格过滤");
        products2.stream().filter((p) -> p.getPrice() < 100).forEach(System.out::println);
        System.out.println("根据颜色过来");
        products2.stream().filter((p) -> p.getColor().equalsIgnoreCase("黄色")).forEach(System.out::println);

        //3、测试() - ()的使用
    }
}
