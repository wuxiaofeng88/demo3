package com.km.controller.component;/**
 * Created by asus-pc on 2019/5/25.
 */

import org.omg.PortableInterceptor.Interceptor;
import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.handler.Handler;

/**
 * @ClassName MyLoginInterceptor
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/5/25 23:37
 * @Version 1.0
 **/
public class MyLoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        if(!StringUtils.isEmpty(loginUser)){
            return true;
        }else{
            request.setAttribute("msg","对不起，你没有权限访问！");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}
