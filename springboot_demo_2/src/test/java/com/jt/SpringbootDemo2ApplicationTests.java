package com.jt;

import com.jt.mapper.DemoUserMapper;
import com.jt.pojo.DemoUser;
import org.apache.tomcat.jni.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest

public class SpringbootDemo2ApplicationTests {

    @Resource
    private DemoUserMapper userMapper;

    @Test
    public void contextLoads() {
        System.out.println(userMapper.getClass());
        System.out.println(userMapper.findAll());
    }

    @Test
    public void testInsert() {
        DemoUser user = new DemoUser();
        user.setId(null).setName("mybatis信息").setAge(18).setSex("男");
        userMapper.insertUser(user);
    }

    @Test
    public void testUpdate() {
        String oldName = "mybatis信息";
        String nowName = "测试信息";
        String sex = "男";
        userMapper.updateUser(oldName, nowName, sex);
    }

    @Test
    public void testDelete() {
        int id=231;
        userMapper.deleteUser(id);
    }

    @Test
    public void testSelect(){
        List<DemoUser> userList=userMapper.selectList(null);
        System.out.println(userList);
    }
}
