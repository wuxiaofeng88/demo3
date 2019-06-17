package com.km.exception;/**
 * Created by asus-pc on 2019/6/17.
 */

/**
 * @ClassName UserNotExistException
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/17 17:55
 * @Version 1.0
 **/
public class UserNotExistException extends RuntimeException{
    public UserNotExistException() {
        super("用户不存在！");
    }
}
