package com.jt.pojo;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 16:48 2021/4/22
 * @Modified By:
 */
public class User {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
