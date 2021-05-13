package com.jt;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.jt.mapper.DemoUserMapper;
import com.jt.pojo.DemoUser;
import net.bytebuddy.build.ToStringPlugin;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 11:42 2021/4/29
 * @Modified By:
 */
@SpringBootTest
public class TestMp {

    @Resource
    private DemoUserMapper userMapper;

    @Test
    public void insert() {
        DemoUser user = new DemoUser();
        user.setName("MP测试").setSex("男").setAge(19);
        userMapper.insert(user);
    }

    @Test
    public void updateById() {
        DemoUser user = new DemoUser();
        user.setName("中午吃什么").setAge(18).setId(232);
        userMapper.updateById(user);
    }

    @Test
    public void testSelect() {
        DemoUser user = userMapper.selectById(21);
        System.out.println(user);
        //2.根据属性查询
        DemoUser user2 = new DemoUser();
        user2.setName("白骨精").setSex("女");
        QueryWrapper<DemoUser> queryWrapper = new QueryWrapper<>(user2);
        List<DemoUser> userList = userMapper.selectList(queryWrapper);
        System.out.println(userList);
    }

    @Test
    public void testSelect2() {
        QueryWrapper<DemoUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("age", 18).eq("sex", "女");
        List<DemoUser> userList = userMapper.selectList(queryWrapper);
        System.out.println(userList);
    }

    @Test
    public void testSelect4() {
        QueryWrapper<DemoUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("sex", "男").orderByDesc("id");
        List<DemoUser> userList = userMapper.selectList(queryWrapper);
        System.out.println(userList);
    }

    @Test
    public void testSelect5() {
        Integer[] ids = {1, 3, 5, 6, 7};
        //需要将数组转化为具体的集合
        List<Integer> idList = Arrays.asList(ids);
        QueryWrapper<DemoUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", idList);
        List<DemoUser> userList = userMapper.selectList(queryWrapper);
        System.out.println(userList);
    }

    @Test
    public void testSelect6() {


        QueryWrapper<DemoUser> queryWrapper = new QueryWrapper<>();
        String name="白骨精";
        int age=18;
        queryWrapper.eq(StringUtils.hasLength(name),"name",name).gt(age > 0, "age", age);
        List<DemoUser> userList = userMapper.selectList(queryWrapper);
        System.out.println(userList);
    }

    @Test
    public void testSelect8(){
        QueryWrapper<DemoUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("name","sex");
        List<DemoUser> objs = userMapper.selectList(queryWrapper);
        System.out.println(objs);
    }
    @Test
    public void testSelect9(){
        QueryWrapper<DemoUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("name","sex");
        List<Map<String,Object>> lists = userMapper.selectMaps(queryWrapper);
        System.out.println(lists);
    }

    @Test
    public void testSelect10(){
        DemoUser user=new DemoUser();
        user.setName("晚上吃什么").setSex("其他");
        UpdateWrapper updateWrapper =new UpdateWrapper();
        updateWrapper.eq("name", "中午吃什么");
        userMapper.update(user, updateWrapper);
    }
}
