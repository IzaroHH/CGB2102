package com.jt.config;

import com.jt.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 15:23 2021/4/23
 * @Modified By:
 */
@Configuration
@ComponentScan("com.jt")
@PropertySource(value="classpath:/user.properties",encoding="UTF-8")
public class SpringConfig {
    @Value("${user.id}")
    private Integer id;
    @Value("${user.username}")
    private String username;

    @Bean
    public User user() {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        return user;
    }

}
