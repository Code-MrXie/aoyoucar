package com.example.demo.controller;

import com.example.demo.pojo.AoyoCommodity;
import com.example.demo.pojo.AoyoCommodityNorms;
import com.example.demo.pojo.LayuiEntity;
import com.example.demo.service.AoyoCommodityNormsService;
import com.example.demo.service.AoyoCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Norms")
public class AoyoCommodityNormsController {
    @Autowired
    private AoyoCommodityNormsService aoyoCommodityNormsService;
    @GetMapping("Normsall")
    public LayuiEntity AoyoCommodityNormsall(){
        LayuiEntity layuiEntity=new LayuiEntity();
        List<AoyoCommodityNorms> Normsall = aoyoCommodityNormsService.Normsall();
        layuiEntity.setData(Normsall);
        layuiEntity.setCount(Normsall.size());
        layuiEntity.setMsg("成功");
        layuiEntity.setCode(0);
        return  layuiEntity;
    }

    @PostMapping("addNorms")
    public String addNorms(AoyoCommodityNorms aoyoCommodityNorms) throws Exception {
        aoyoCommodityNormsService.addNorms(aoyoCommodityNorms);
        return  "sssss";
    }
}
