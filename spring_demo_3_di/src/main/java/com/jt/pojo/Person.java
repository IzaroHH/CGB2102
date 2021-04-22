package com.jt.pojo;

import java.util.Map;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 14:53 2021/4/22
 * @Modified By:
 */
public class Person {
    private Map map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Person{" +
                "map=" + map +
                '}';
    }
}
