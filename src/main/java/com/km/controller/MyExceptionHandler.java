package com.km.controller;/**
 * Created by asus-pc on 2019/6/17.
 */

import com.km.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MyExceptionHandler
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/17 18:10
 * @Version 1.0
 **/
@ControllerAdvice
public class MyExceptionHandler {
    //下面这种处理方式，浏览器和其他客户端都是返回json数据，不能做到浏览器返回自己定制的错误页面，其他客户端返回自己定制的json数据
/*    @ResponseBody
    @ExceptionHandler(UserNotExistException.class)
    public Map<String, Object> handleException(Exception exception){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code","user.notExist");
        map.put("message",exception.getMessage());
        return map;
    }*/

    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception exception, HttpServletRequest request){
        request.setAttribute("javax.servlet.error.status_code",406);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code","user.notExist");
        map.put("message",exception.getMessage());
        request.setAttribute("ext",map);
        return "forward:/error";
    }
}
