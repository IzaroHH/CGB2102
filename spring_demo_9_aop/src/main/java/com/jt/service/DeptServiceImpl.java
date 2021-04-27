package com.jt.service;

import org.springframework.stereotype.Service;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 10:51 2021/4/26
 * @Modified By:
 */
@Service
public class DeptServiceImpl implements DeptService{
    @Override
    public void addDept() {
        System.out.println("添加部门信息");
    }

    @Override
    public void updateDept() {
        System.out.println("更新部门信息");
    }
}
