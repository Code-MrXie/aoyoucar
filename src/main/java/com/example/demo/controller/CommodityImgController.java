package com.example.demo.controller;

import com.example.demo.pojo.AoyoCommodityImg;
import com.example.demo.service.CommodityImgService;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comodityImg")
public class CommodityImgController {
    @Autowired
    private CommodityImgService commodityImgService;
    @RequestMapping("/queryComodityImgList")
    public Result queryComodityImgList(){
        List<AoyoCommodityImg> commodityImgList=commodityImgService.queryComodityImgList();
        return new Result(true,200,"查询成功",commodityImgList);
    }
}
