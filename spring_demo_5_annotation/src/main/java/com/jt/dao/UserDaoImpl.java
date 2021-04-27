package com.jt.dao;

import com.jt.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * <bean id="类名首字母小写~~userDaoImpl"  class="UserDaoImpl.class" />
 * 如果需要修改beanId则手动添加value属性即可
 * @author Tedu
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao{

    @Override
    public void addUser(User user) {
        System.out.println("链接数据库执行insert into :"+user);
    }
}