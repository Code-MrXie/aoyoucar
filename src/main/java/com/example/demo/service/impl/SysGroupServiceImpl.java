package com.example.demo.service.impl;

import com.example.demo.mapper.SysGroupMapper;
import com.example.demo.pojo.SysGroup;
import com.example.demo.service.SysGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysGroupServiceImpl implements SysGroupService {
    @Autowired
    SysGroupMapper sgm;

    //店铺列表展示
    @Override
    public List<SysGroup> GetGroupAll() {
        return sgm.GetGroupAll();
    }

    //店铺列表展示---店铺删除
    @Override
    public boolean DelGroup(Integer groupId) {
        return sgm.DelGroup(groupId);
    }

    //店铺列表展示---店铺修改
    @Override
    public boolean groupUpdate(SysGroup sysGroup) {
        return sgm.groupUpdate(sysGroup);
    }


}
