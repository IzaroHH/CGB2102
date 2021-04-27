package com.jt.service;

import org.springframework.stereotype.Service;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 16:55 2021/4/25
 * @Modified By:
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService{
    @Override
    public void addDept() {
        System.out.println("调用DeptMapper.实现入库操作");
    }
}
