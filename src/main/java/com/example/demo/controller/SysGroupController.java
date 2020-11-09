package com.example.demo.controller;

import com.example.demo.pojo.SysGroup;
import com.example.demo.service.SysGroupService;
import com.example.demo.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sysgroup")
public class SysGroupController {
    @Autowired
    private SysGroupService sgs;

    //店铺列表展示
    @GetMapping("GetGroupAll")
    public BaseResponse GetGroupAll(){
        List<SysGroup> list=sgs.GetGroupAll();
        return  new BaseResponse(0,"成功",list);
    }

    //店铺列表展示---店铺删除
    @GetMapping("DelGroup")
    public boolean DelGroup(Integer groupId){
        boolean b=sgs.DelGroup(groupId);
        return  b;
    }

    //店铺列表展示---店铺修改
    @RequestMapping("groupUpdate")
    @ResponseBody
    public boolean groupUpdate(SysGroup sysGroup){
        boolean b=sgs.groupUpdate(sysGroup);
        return  b;
    }
}
