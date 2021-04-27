package com.jt.controller;

import com.jt.pojo.User;
import com.jt.service.UserService;
import org.springframework.stereotype.Controller;

/**
 * @author Tedu
 */
@Controller
public class UserController {


    private UserService userService;
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        userService.addUser(user);
    }


}