package com.jt.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 10:47 2021/5/11
 * @Modified By:
 */
@Data
@Accessors(chain = true)
public class AxiosPOJO {
    private Integer id;
    private String name;
}
