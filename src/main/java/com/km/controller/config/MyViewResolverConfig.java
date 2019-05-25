package com.km.controller.config;/**
 * Created by asus-pc on 2019/5/19.
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName MyViewResolverConfig
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/5/19 18:57
 * @Version 1.03
 **/
//@EnableWebMvc
@Configuration
public class MyViewResolverConfig extends WebMvcConfigurerAdapter{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
    }
}
