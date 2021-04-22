package com.jt;

import com.jt.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 16:13 2021/4/21
 * @Modified By:
 */
public class TestSpring {
    @Test
    public void TestStatic() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Calendar calendar1 = (Calendar) context.getBean("calendar1");
        System.out.println(calendar1.getTime());
    }

    @Test
    public void TestInstance() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Calendar calendar1 = (Calendar) context.getBean("calendar2");
        System.out.println(calendar1.getTime());
    }

    @Test
    public void TestUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        context.getBean("user");
        context.getBean("user");
        context.getBean("user");
    }

    @Test
    public void TestLife() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User user = (User) context.getBean("user");
        user.say();
        context.close();
    }
}
