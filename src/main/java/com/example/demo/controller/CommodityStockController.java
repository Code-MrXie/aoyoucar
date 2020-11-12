package com.example.demo.controller;

import com.example.demo.pojo.AoyoCommodityStock;
import com.example.demo.pojo.LayuiEntity;
import com.example.demo.service.CommodityStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Stock")
public class CommodityStockController {
    @Autowired
    private CommodityStockService commodityStockService;
    //查询
    @GetMapping("Stockall")
    public LayuiEntity CommodityStockNormsall(){
        LayuiEntity layuiEntity=new LayuiEntity();
        List<AoyoCommodityStock> Stockall = commodityStockService.Stockall();
        layuiEntity.setData(Stockall);
        layuiEntity.setCount(Stockall.size());
        layuiEntity.setMsg("成功");
        layuiEntity.setCode(0);
        return  layuiEntity;
    }
    //添加
    @GetMapping("insertStock")
    public String StockAdd(AoyoCommodityStock aoyoCommodityStock) throws Exception {
        commodityStockService.StockAdd(aoyoCommodityStock);
        return "AAAAA";
    }
}
