package com.jt.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Tedu
 */
@Data
@Accessors(chain = true)
public class DemoUser {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;


}
