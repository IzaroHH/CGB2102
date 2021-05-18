package com.jt.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
import com.jt.vo.PageResult;
import jdk.nashorn.internal.parser.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 刘昱江
 * 时间 2021/5/11
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.selectList(null);
    }

    @Override
    public String findUserByUP(User user) {
        String md5Pass = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        user.setPassword(md5Pass);
        QueryWrapper queryWrapper = new QueryWrapper(user);
        User userDB = userMapper.selectOne(queryWrapper);
        String token = UUID.randomUUID().toString().replace("-", "");
        return userDB == null ? null : token;
    }

    @Override
    public PageResult findUserByPage(PageResult pageResult) {
        IPage<User> page = new Page<>(pageResult.getPageNum(), pageResult.getPageSize());
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        boolean flag = StringUtils.hasLength(pageResult.getQuery());
        queryWrapper.like(flag, "username", pageResult.getQuery());
        page = userMapper.selectPage(page, queryWrapper);
        long total = page.getTotal();
        List<User> userList = page.getRecords();
        return pageResult.setTotal(total).setRows(userList);
    }

    @Override
    public void updateStatus(User user) {
        userMapper.updateById(user);
    }

    @Override
    public void addUser(User user) {
        //1.密码加密
        String md5Pass =
                DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        user.setPassword(md5Pass).setStatus(true);
        userMapper.insert(user);

    }
}
