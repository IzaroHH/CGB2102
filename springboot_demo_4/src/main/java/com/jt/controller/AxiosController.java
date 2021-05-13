package com.jt.controller;

import com.jt.pojo.AxiosPOJO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 10:49 2021/5/11
 * @Modified By:
 */
@RestController
@CrossOrigin
public class AxiosController {
    /**
     * Axios入门案例
     *  url: http://localhost:8090/hello
     */
    @GetMapping("/hello")
    public String hello(){

        return "VUE的ajax异步调用";
    }

    /**
     * 1.接收get请求的Id参数
     *   http://localhost:8090/axios?id=100
     */
    @GetMapping("/axios")
    public String getAxios(Integer id){

        return "动态获取数据:"+id;
    }

    /**
     * restFul接收参数
     * http://localhost:8090/axios/100
     */
    @GetMapping("/axios/{id}")
    public String axiosRestFul(@PathVariable Integer id){

        return "restFul接收参数:"+id;
    }

    /**
     * 测试params对象数据传参
     * /axiosParams
     */
    @GetMapping("/axiosParams")
    public String params(Integer id){

        return "params获取参数成功!!!";
    }

    /**
     * 动态接收post请求 并且接收json参数
     *   url地址: /addAxios
     *  语法:
     *      如果前端传递的是一个JSON的字符串.
     *      则使用注解 @RequestBody 将json串转化为对象
     */
    @PostMapping("/addAxios")
    public AxiosPOJO addAxios(@RequestBody AxiosPOJO axiospojo){

        return axiospojo;
    }

    //利用Form表单接收数据
    @PostMapping("/addAxiosForm")
    public AxiosPOJO addAxiosForm(AxiosPOJO axiospojo){

        return axiospojo;
    }
}