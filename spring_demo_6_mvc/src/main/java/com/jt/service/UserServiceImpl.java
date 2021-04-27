package com.jt.service;

import com.jt.dao.UserDao;
import com.jt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 14:34 2021/4/23
 * @Modified By:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
