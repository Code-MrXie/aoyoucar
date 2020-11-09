package com.example.demo.mapper;

import com.example.demo.pojo.AoyoCommodity;
import com.example.demo.pojo.SysGroup;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysGroupMapper {
    List<SysGroup> GetGroupAll();

    boolean DelGroup(@Param("groupId") Integer groupId);

    boolean groupUpdate(@Param("sysGroup") SysGroup sysGroup);

    List<AoyoCommodity> GetCommodityAll(@Param("groupId") Integer groupId);
}
