package com.jt.service;

import com.jt.dao.UserDao;
import com.jt.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author Tedu
 */
@Service
public class UserServiceImpl implements UserService{

    private UserDao abc;

    public void setAbc(UserDao abc) {
        this.abc = abc;
    }

    @Override
    public void addUser(User user) {
        String name = user.getName() + "加工数据";
        user.setName(name);
        abc.addUser(user);
    }
}