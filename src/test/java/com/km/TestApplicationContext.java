package com.km;
/**
 * Created by asus-pc on 2019/7/11.
 */
import com.km.entities.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName TestApplicationContext
 * @Description TODO
 * @Author wujiancai
 * @Date 2019/7/11 10:54
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationContext
{
    @Test
    public void testApplicationGetBean(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Person p1 = (Person)ctx.getBean(Person.class);
        /*Person p1 = (Person)ctx.getBean("zhangsan");*/
        System.out.println(p1);
    }
}
