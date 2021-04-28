package com.jt.mapper;

import com.jt.pojo.DemoUser;

import java.util.List;

/**
 * @author Tedu
 */
public interface DemoUserMapper {
    /**
     * 查
     * @return
     */
    List<DemoUser> findAll();

    /**
     * 增
     * @param user
     */
    void insertUser(DemoUser user);

    /**
     * 改
     * @param oldName
     * @param nowName
     * @param sex
     */
    void updateUser(String oldName, String nowName, String sex);
    /**
     *删
     * @param id
     */
    void deleteUser(int id);
}
