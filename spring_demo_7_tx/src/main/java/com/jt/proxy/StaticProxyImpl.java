package com.jt.proxy;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
import com.jt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 14:34 2021/4/25
 * @Modified By:
 */
@Service("userService")
public class StaticProxyImpl implements UserService{

    @Autowired
    private UserService target;

    @Override
    public void addUser(User user){
        try {
            System.out.println("事务开始");
            target.addUser(user);
            System.out.println("事务结束");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("事务回滚");
        }
    }

    @Override
    public void deleteUser(User user) {
        try {
            System.out.println("事务开始");
            target.deleteUser(user);
            System.out.println("事务结束");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("事务回滚");
        }
    }
}
