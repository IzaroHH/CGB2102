package com.jt;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jt.controller.UserController;


/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 9:19 2021/4/23
 * @Modified By:
 */
public class TestSpring {

    @Test
    public void testSpringMVC() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserController user = context.getBean(UserController.class);
        user.addUser();
    }

    @Test
    public void testSpring(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application_annotation.xml");
        UserController user = (UserController) context.getBean("userController");
        System.out.println(user);
        System.out.println("恭喜学会MVC结构");
    }

    @Test
    public void testGetController(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application_annotation.xml");
        UserController user = context.getBean(UserController.class);
        System.out.println(user);
    }
}