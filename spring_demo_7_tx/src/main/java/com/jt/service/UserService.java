package com.jt.service;

import com.jt.pojo.User;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 9:48 2021/4/25
 * @Modified By:
 */
public interface UserService {
    /**
     * UserService接口
     * @param user
     */
    void addUser(User user);

    /**
     * 删除
     * @param user
     */
    void deleteUser(User user);
}
