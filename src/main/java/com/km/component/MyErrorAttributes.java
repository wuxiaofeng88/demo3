package com.km.component;/**
 * Created by asus-pc on 2019/6/17.
 */

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * @ClassName MyErrorAttributes
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/17 19:16
 * @Version 1.0
 **/
@Component
public class MyErrorAttributes extends DefaultErrorAttributes{
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);
        errorAttributes.put("company","km");
        errorAttributes.putAll((Map<String, Object>)webRequest.getAttribute("ext",0));
        return errorAttributes;
    }
}
