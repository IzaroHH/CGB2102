package com.jt.dao;

import com.jt.pojo.User;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 15:23 2021/4/22
 * @Modified By:
 */
public class UserDaoImpl implements UserDao{

    @Override
    public void addUser(User user) {
        System.out.println("添加用户:"+user);
    }
}
