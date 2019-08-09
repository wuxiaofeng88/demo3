package com.km;

/**
 * Created by asus-pc on 2019/8/4.
 */
public interface ProducePredicate<T> {
    boolean test(T t);
}
