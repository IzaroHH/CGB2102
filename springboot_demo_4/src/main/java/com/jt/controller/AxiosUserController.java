package com.jt.controller;

import com.jt.pojo.User;
import com.jt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 14:10 2021/5/11
 * @Modified By:
 */
@RestController
@CrossOrigin
public class AxiosUserController {

    @Autowired
    private UserService userService;

    @GetMapping("/axiosUser/findAll")
    public List<User> findAll() {

        return userService.findAll();
    }

    @PutMapping("axiosUser/updateUser")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    /**
     * 业务需求:删除用户信息
     * URL:http://localhost:8080/axiosUser/deleteUser
     * 参数:id=1
     * 返回值:void
     */
    @DeleteMapping("axiosUser/deleteUser")
    public void deleteUser(Integer id){
        userService.deleteUserById(id);
    }

}
