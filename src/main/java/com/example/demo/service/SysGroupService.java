package com.example.demo.service;

import com.example.demo.pojo.AoyoCommodity;
import com.example.demo.pojo.SysGroup;

import java.util.List;

public interface SysGroupService {
    List<SysGroup> GetGroupAll();

    boolean DelGroup(Integer groupId);

    boolean groupUpdate(SysGroup sysGroup);

    List<AoyoCommodity> GetCommodityAll(Integer groupId);
}
