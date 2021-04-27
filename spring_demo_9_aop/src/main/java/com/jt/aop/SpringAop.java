package com.jt.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 10:48 2021/4/26
 * @Modified By:
 */
@Component
@Aspect
public class SpringAop {
    @Pointcut("@annotation(com.jt.anno.Cache)")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("获取目标对象的类型:" + joinPoint.getTarget().getClass());
        System.out.println("获取目标对象类名:" + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("获取目标对象方法名:" + joinPoint.getSignature().getName());
        System.out.println("获取方法参数:" + Arrays.toString(joinPoint.getArgs()));
        System.out.println("我是before通知");

    }

    @AfterReturning("pointcut()")
    public void afterReturning() {
        System.out.println("我是afterReturning通知");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing() {
        System.out.println("我是异常通知");
    }

    @After("pointcut()")
    public void after() {
        System.out.println("我是after通知");
    }
}