package com.jt.mapper;


import com.jt.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 9:46 2021/4/25
 * @Modified By:
 */
@Repository
public class UserMapperImpl implements UserMapper {

    @Override
    public void addUser(User user) {
        System.out.println("用户入库:"+user);
    }

    @Override
    public void deleteUser(User user){
        System.out.println("删除用户:"+user);
    }
}
