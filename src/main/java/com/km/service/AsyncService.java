package com.km.service;
/**
 * Created by asus-pc on 2019/6/26.
 */

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ClassName AsyncService
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/6/26 10:04
 * @Version 1.0
 **/
@Service
public class AsyncService {
    @Async
    public void sayHello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("调用AsyncService的sayHello方法！");
    }
}
