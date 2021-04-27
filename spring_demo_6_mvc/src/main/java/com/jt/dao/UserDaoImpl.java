package com.jt.dao;

import com.jt.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 14:15 2021/4/23
 * @Modified By:
 */
@Repository
public class UserDaoImpl implements UserDao{


    @Override
    public void addUser(User user) {
        System.out.println("新增用户数据:"+user);
    }
}
