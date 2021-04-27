package com.jt;

import com.jt.config.SpringConfig;
import com.jt.controller.UserController;
import com.jt.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 14:41 2021/4/23
 * @Modified By:
 */
public class TestSpring {
    @Test
    public void TestM(){
        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
        UserController user=context.getBean(UserController.class);
        UserController user1= (UserController) context.getBean("userController");
        user.addUser();
        user1.addUser();
        System.out.println(user);
    }

    @Test
    public void testAnno(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController user=context.getBean(UserController.class);
        user.addUser();
    }
}
