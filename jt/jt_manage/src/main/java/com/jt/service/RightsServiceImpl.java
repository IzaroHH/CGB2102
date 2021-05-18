package com.jt.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jt.mapper.RightsMapper;
import com.jt.pojo.Rights;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 16:44 2021/5/14
 * @Modified By:
 */
@Service
public class RightsServiceImpl implements RightsService{
    @Resource
    private RightsMapper rightsMapper;

    @Override
    public List<Rights> findRightsList() {
        QueryWrapper<Rights> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("parent_id",0);
        List<Rights> oneList =
                rightsMapper.selectList(queryWrapper);
        //2.如何查询二级菜单  父子关系的封装!!!
        for (Rights oneRights : oneList){
            queryWrapper.clear();
            queryWrapper.eq("parent_id",oneRights.getId());
            List<Rights> twoList = rightsMapper.selectList(queryWrapper);
            oneRights.setChildren(twoList);
        }
        return oneList;
    }
}
