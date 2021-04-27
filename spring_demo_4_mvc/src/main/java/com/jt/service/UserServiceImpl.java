package com.jt.service;

import com.jt.dao.UserDao;
import com.jt.pojo.User;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 15:32 2021/4/22
 * @Modified By:
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
