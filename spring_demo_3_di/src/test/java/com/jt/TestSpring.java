package com.jt;

import com.jt.pojo.Person;
import com.jt.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 12:04 2021/4/22
 * @Modified By:
 */
public class TestSpring {
    @Test
    public void testDI(){
        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
        User user=context.getBean(User.class);
        Person person=context.getBean(Person.class);
        System.out.println(person.toString());
        System.out.println(user.toString());
        System.out.println(user);
    }
}
