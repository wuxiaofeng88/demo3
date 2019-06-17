package com.km;/**
 * Created by asus-pc on 2019/6/17.
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @ClassName MyServletListenner
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/17 21:21
 * @Version 1.0
 **/
public class MyServletListenner implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextInitialized...web项目启动！");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("contextDestroyed...web项目关闭！");
    }
}
