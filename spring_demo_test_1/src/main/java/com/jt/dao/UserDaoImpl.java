package com.jt.dao;

import com.jt.pojo.User;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 9:01 2021/4/23
 * @Modified By:
 */
public class UserDaoImpl implements UserDao{

    @Override
    public void addUser(User user) {
        System.out.println("*******:"+user);
    }
}
