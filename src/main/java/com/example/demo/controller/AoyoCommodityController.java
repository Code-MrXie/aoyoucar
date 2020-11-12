package com.example.demo.controller;

import com.example.demo.pojo.AoyoCommodity;
import com.example.demo.pojo.AoyoCommodityNorms;
import com.example.demo.pojo.AoyoMerchant;
import com.example.demo.pojo.LayuiEntity;
import com.example.demo.service.AoyoCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Commodity")
public class AoyoCommodityController {
    @Autowired
    private AoyoCommodityService aoyoCommodityService;
    @GetMapping("Commodityall")
    public LayuiEntity useCommodityallrall(){
        LayuiEntity layuiEntity=new LayuiEntity();
        List<AoyoCommodity> Commodityall = aoyoCommodityService.Commodityall();
        layuiEntity.setData(Commodityall);
        layuiEntity.setCount(Commodityall.size());
        layuiEntity.setMsg("成功");
        layuiEntity.setCode(0);
        return  layuiEntity;
    }

    @GetMapping("showDetailById/{id}")
    public AoyoCommodity showDetailById(@PathVariable Integer id){
        return aoyoCommodityService.showDetailById(id);
    }
    @PostMapping("insertCommodity")
    public String addCommoditys(@RequestBody AoyoCommodity aoyoCommodity) throws Exception {
        System.out.println(aoyoCommodity);
        aoyoCommodityService.addCommoditys(aoyoCommodity);
        return  "cccc";
    }
}
