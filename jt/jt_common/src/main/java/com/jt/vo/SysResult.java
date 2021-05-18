package com.jt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 16:30 2021/5/13
 * @Modified By:
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class SysResult {
    /**
     * 200成功 201失败
     */
    private Integer status;
    private String msg;
    private Object data;

    public static SysResult fail() {
        return new SysResult(201, "服务器运行失败", null);
    }

    public static SysResult success() {
        return new SysResult(200, "服务器运行成功!", null);
    }

    public static SysResult success(Object data) {
        return new SysResult(200, "服务器运行成功!", data);
    }

    public static SysResult success(String msg, Object data) {
        return new SysResult(200, msg, data);
    }


}
