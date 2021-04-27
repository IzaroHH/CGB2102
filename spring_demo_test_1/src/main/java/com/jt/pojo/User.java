package com.jt.pojo;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 8:59 2021/4/23
 * @Modified By:
 */
public class User {
    private Integer id;
    private String name;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
