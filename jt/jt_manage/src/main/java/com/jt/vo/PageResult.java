package com.jt.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 15:02 2021/5/18
 * @Modified By:
 */
@Data
@Accessors(chain=true)
public class PageResult {
    private String query;
    private Integer pageNum;
    private Integer pageSize;
    private Long total;
    private Object rows;
}
