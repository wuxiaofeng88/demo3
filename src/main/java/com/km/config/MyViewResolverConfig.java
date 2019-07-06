package com.km.config;
/**
 * Created by asus-pc on 2019/5/19.
 */

import com.km.component.MyLocaleResolver;
import com.km.component.MyLoginInterceptor;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

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
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyLoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/","/index","/index.html","/user/login","/static/**","/myServlet","/myFilter","/testEpt","/testAsynService","/sendMail","/sendMultiPartMail","/hotDeploy","/hello","/study","/sshello");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
