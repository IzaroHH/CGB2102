package com.jt.controller;

import com.jt.pojo.Rights;
import com.jt.service.RightsService;
import com.jt.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 16:41 2021/5/14
 * @Modified By:
 */
@RestController
@CrossOrigin
@RequestMapping("/rights")
public class RightsController {
    @Resource
    private RightsService rightsService;

    @GetMapping("/getRightsList")
    public SysResult getRightsList(){
        List<Rights> rightsList =
                rightsService.findRightsList();
        return SysResult.success(rightsList);
    }
}
