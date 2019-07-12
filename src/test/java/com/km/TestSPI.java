package com.km;
/**
 * Created by asus-pc on 2019/7/12.
 */

import com.km.interfaces.IShout;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ServiceLoader;

/**
 * @ClassName TestSPI
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/12 19:02
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSPI {
    @Test
    public void testSpi(){
        ServiceLoader<IShout> shouts = ServiceLoader.load(IShout.class);
        for(IShout iShout : shouts){
            iShout.shout();;
        }
    }
}
