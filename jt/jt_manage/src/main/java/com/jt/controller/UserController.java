package com.jt.controller;

import com.jt.pojo.User;
import com.jt.service.UserService;
import com.jt.vo.PageResult;
import com.jt.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 刘昱江
 * 时间 2021/5/11
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public SysResult login(@RequestBody User user) {
        String token = userService.findUserByUP(user);
        if (StringUtils.hasLength(token)) {
            return SysResult.success(token);
        } else {
            return SysResult.fail();
        }
    }

    @GetMapping("/list")
    public SysResult findUserByPage(PageResult pageResult){
        pageResult =userService.findUserByPage(pageResult);
        return SysResult.success(pageResult);
    }

    @PutMapping("/status/{id}/{status}")
    public SysResult updateStatus(User user){
        userService.updateStatus(user);
        return SysResult.success();
    }

    @PostMapping("/addUser")
    public SysResult addUser(@RequestBody User user){
        userService.addUser(user);
        return SysResult.success();
    }
}
