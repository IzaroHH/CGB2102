package com.jt.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 14:46 2021/4/25
 * @Modified By:
 */
public class JdkProxyFactory {
    public static Object getProxy(final Object target) {

        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        Object proxy = Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result=null;
                try {
                    System.out.println("事务开始");
                    result = method.invoke(target,args);
                    System.out.println("事务结束");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("事务回滚");
                }
                return result;
            }
        });
        return proxy;
    }
}
