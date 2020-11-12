package com.example.demo.controller;

import com.example.demo.pojo.AoyoGroupUser;
import com.example.demo.pojo.AoyoMerchant;
import com.example.demo.pojo.LayuiEntity;
import com.example.demo.service.AoyoMerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("information")
public class AoyoMerchantController {
    @Resource
    private AoyoMerchantService aoyoMerchantService;
    @GetMapping("informationall")
    public LayuiEntity userall(){
        LayuiEntity layuiEntity=new LayuiEntity();
        List<AoyoMerchant> informationall = aoyoMerchantService.informationall();
        layuiEntity.setData(informationall);
        layuiEntity.setCount(informationall.size());
        layuiEntity.setMsg("成功");
        layuiEntity.setCode(0);
        return  layuiEntity;
    }
}
