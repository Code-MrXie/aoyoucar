package com.example.demo.controller;

import com.example.demo.mapper.AoyoGroupUderMapper;
import com.example.demo.mapper.AoyoUderMapper;
import com.example.demo.pojo.AoyoGroupUser;
import com.example.demo.pojo.LayuiEntity;
import com.example.demo.service.AoyoGroupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class AoyoGroupUserController {
    @Autowired
    private AoyoGroupUserService aoyoGroupUserService;
    @GetMapping("useralls")
    public LayuiEntity userall(){
        LayuiEntity layuiEntity=new LayuiEntity();
        List<AoyoGroupUser> useralls = aoyoGroupUserService.useralls();
        layuiEntity.setData(useralls);
        layuiEntity.setCount(useralls.size());
        layuiEntity.setMsg("成功");
        layuiEntity.setCode(0);
      return  layuiEntity;
    }

}
