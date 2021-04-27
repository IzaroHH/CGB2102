package com.jt.mapper;

import com.jt.pojo.User;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 9:46 2021/4/25
 * @Modified By:
 */
public interface UserMapper {
    /**
     * 接口USerMapper
     * @param user
     */
    void addUser(User user);

    /**
     * Delete
     * @param user
     */
    void deleteUser(User user);
}
