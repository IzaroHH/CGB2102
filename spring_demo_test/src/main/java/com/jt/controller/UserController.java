package com.jt.controller;

import com.jt.pojo.User;
import com.jt.service.UserService;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 16:52 2021/4/22
 * @Modified By:
 */
public class UserController {
    private UserService userService;
    private User user;


    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    public void setUser(User user) {
        this.user = user;
    }

    public void addUser() {
        userService.addUser(user);
    }


}
