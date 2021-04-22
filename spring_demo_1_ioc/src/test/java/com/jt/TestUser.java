package com.jt;

import com.jt.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 15:03 2021/4/21
 * @Modified By:
 */
public class TestUser {
    @Test
    public void testSpring01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User user = (User) context.getBean("user");
        user.say();
    }

    @Test
    public void demo2() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> userClass=Class.forName("com.jt.pojo.User");
        User user=(User)userClass.newInstance();
        user.say();
    }
}
