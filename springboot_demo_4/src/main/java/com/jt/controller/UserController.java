package com.jt.controller;

import com.jt.pojo.User;
import com.jt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 要求跳转到userAjax页面中
     * @return
     */
    @RequestMapping("/userAjax")
    public String userAjax(){
        return "userAjax";
    }

    /**
     * 接收ajax请求 /findAjaxUser  查询所有的用户信息
     * 返回值结果:  JSON字符串
     * @return
     */
    @RequestMapping("/findAjaxUser")
    @ResponseBody
    public List<User> findAjaxUser(){

        return userService.findAll();
    }






    @RequestMapping("/demo")
    @ResponseBody
    public String demo(){

        return "框架整合初步完成";
    }

    /**
     * 查询所有的用户列表数据,在userList.html中展现数据
     */
    @RequestMapping("/userList")
    public String userList(Model model){
        //1.查询业务层获取数据
        List<User> userList = userService.findAll();
        //2.将数据保存到Model对象中返回给页面
        model.addAttribute("userList",userList);
        return "userList";
    }

    /**
     * 需求: 利用restFul实现用户数据新增
     *       新增之后重定向到userList.html页面
     * URL地址: /user/tom/18/男
     * 优化策略:
     *      1.如果有多个参数提交,则可以使用对象接收,但是要求
     *      参数名称必须与属性名称一致
     */
    @RequestMapping("/user/{name}/{age}/{sex}")
    public String insertUser(User user){

        userService.insertUser(user);
        return "redirect:/userList";
    }

    /**
     * 需求1: 利用restFul实现用户数据修改
     *       之后重定向到userList.html页面
     *       URL地址: /user/id/name
     **/
    @RequestMapping("/user/{id}/{name}")
    public String updateUser(User user){

        userService.updateUser(user);
        //重新发起请求..
        return "redirect:/userList";
    }


    /**
     * 需求2:
     *        利用restFul实现数据删除
     *        url: /user/100(id)
     *        之后重定向到userList.html页面
     *
     * 需求3: jQuery的Ajax 预习
     */
    @RequestMapping("/user/{id}")
    public String deleteUser(@PathVariable Integer id){

        userService.deleteUserById(id);
        //重新发起请求..
        return "redirect:/userList";
    }
}
