package com.jt.dao;

import com.jt.pojo.User;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 16:48 2021/4/22
 * @Modified By:
 */
public class UserDaoImpl implements UserDao{


    @Override
    public void addUser(User user) {
        System.out.println("*****:"+user);
    }
}
