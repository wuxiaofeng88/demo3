package com.km;
/**
 * Created by asus-pc on 2019/8/4.
 */

/**
 * @ClassName Product
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/8/4 17:53
 * @Version 1.0
 **/
public class Product {
    private String color;
    private int price;

    public Product() {
    }

    public Product(String color) {
        this.color = color;
    }

    public Product(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
