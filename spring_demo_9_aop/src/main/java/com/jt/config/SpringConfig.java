package com.jt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 10:47 2021/4/26
 * @Modified By:
 */
@Configuration
@ComponentScan("com.jt")
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class SpringConfig {
}
