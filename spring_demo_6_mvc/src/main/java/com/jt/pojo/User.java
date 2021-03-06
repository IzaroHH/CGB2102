package com.jt.pojo;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 14:11 2021/4/23
 * @Modified By:
 */
public class User {
    /**
     * 自动装配不能注入简单属性
     */
    private Integer id;
    private String username;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
