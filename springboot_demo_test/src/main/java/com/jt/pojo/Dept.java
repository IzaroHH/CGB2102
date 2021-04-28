package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 将对象交给Spring容器管理
 *
 * @Author:Izaro
 * @Description:
 * @Date:Created in 16:32 2021/4/27
 * @Modified By:
 */
@Component
@PropertySource(value = "classpath:/dept.properties", encoding = "UTF-8")
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    /**
     * speL表达式
     */
    @Value("${dept.id}")
    private Integer id;
    @Value("${dept.name}")
    private String name;

    @Value("${dept.id2}")
    private Integer id2;
    @Value("${dept.name2}")
    private String name2;
}
