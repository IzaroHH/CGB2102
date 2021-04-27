package com.jt.controller;

import com.jt.pojo.User;
import com.jt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 14:39 2021/4/23
 * @Modified By:
 */
@Controller
public class UserController {

    @Qualifier("userServiceA")
    private UserService userService;
    @Autowired
    private User user;
    public void addUser(){
        User user=new User();
        user.setId(101);
        user.setUsername("不知火舞|王昭君");
        userService.addUser(user);
    }
}
