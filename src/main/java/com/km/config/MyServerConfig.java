package com.km.config;/**
 * Created by asus-pc on 2019/6/17.
 */

import com.km.MyServletListenner;
import com.km.filter.MyFilter;
import com.km.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @ClassName MyServerConfig
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/17 20:35
 * @Version 1.0
 **/
@Configuration
public class MyServerConfig {
    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(),"/myServlet");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/myFilter"));
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean myServletListener(){
        ServletListenerRegistrationBean<MyServletListenner> servletRegistrationBean = new ServletListenerRegistrationBean<MyServletListenner>(new MyServletListenner());
        return servletRegistrationBean;
    }
}
