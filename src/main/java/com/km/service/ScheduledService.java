package com.km.service;
/**
 * Created by asus-pc on 2019/6/26.
 */

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @ClassName ScheduledService
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/26 10:51
 * @Version 1.0
 **/
@Service
public class ScheduledService {
    @Scheduled(cron = "13,29,59 * * * * 6")
    public void printInfo(){
        System.out.println("执行ScheduledService的printInfo()方法！");
    }
}
