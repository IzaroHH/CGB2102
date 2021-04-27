package com.jt;

import com.jt.controller.UserController;
import com.jt.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 16:33 2021/4/22
 * @Modified By:
 */
public class TestSpring {
    @Test
    public void testSpringMVC(){
        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
        UserController user=context.getBean(UserController.class);
        user.addUser();
    }
}
