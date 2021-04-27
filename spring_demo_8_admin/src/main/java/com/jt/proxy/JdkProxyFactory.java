package com.jt.proxy;

import com.jt.service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 17:10 2021/4/25
 * @Modified By:
 */
public class JdkProxyFactory {
    public static Object getProxy(final Object target) {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        Object proxy = Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Long startTime = System.currentTimeMillis();
                Object result = method.invoke(target);
                Thread.sleep(2000);
                Long endTime = System.currentTimeMillis();
                System.out.println("程序执行:" + (endTime - startTime) + "毫秒");
                return result;
            }
        });
        return proxy;
    }
}
