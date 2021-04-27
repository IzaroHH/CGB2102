package com.jt.service;

import com.jt.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 17:02 2021/4/25
 * @Modified By:
 */
@Service("target")
public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        Long startTime=System.currentTimeMillis();
        System.out.println("新增用户");
        Long endTime = System.currentTimeMillis();
        System.out.println("运行了:"+(endTime-startTime)+"毫秒");
    }

    @Override
    public void deleteUser() throws InterruptedException {
        Long startTime=System.currentTimeMillis();
        System.out.println("删除用户");
        Thread.sleep(2000);
        Long endTime = System.currentTimeMillis();
        System.out.println("运行了:"+(endTime-startTime)+"毫秒");
    }
}
