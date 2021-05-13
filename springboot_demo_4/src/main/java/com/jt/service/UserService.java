package com.jt.service;

import com.jt.pojo.User;

import java.util.List;

/**
 * @author Tedu
 */
public interface UserService {
    /**
     * 321
     * @return
     */
    List<User> findAll();

    /**
     * 4321
     * @param user
     */
    void insertUser(User user);

    /**
     * 543
     * @param user
     */
    void updateUser(User user);

    /**
     * 765
     * @param id
     */
    void deleteUserById(Integer id);

}
