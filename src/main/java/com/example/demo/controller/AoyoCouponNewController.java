package com.example.demo.controller;

import com.example.demo.pojo.AoyoCouponNew;
import com.example.demo.service.AoyoCouponNewService;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/AoyoCouponNew")
@RestController
public class AoyoCouponNewController {
    @Autowired
    private AoyoCouponNewService aoyoCouponNewService;
    @PostMapping("queryAoyoCouponNewList")
    public Map queryAoyoCouponNewList(AoyoCouponNew couponNew){
        PageInfo<AoyoCouponNew> couponNews= aoyoCouponNewService.queryAoyoCouponNewList(couponNew);
        Map map = new HashMap();
        map.put("data",couponNews.getList());
        map.put("count",couponNews.getTotal());
        map.put("code",0);
        map.put("msg","查询成功");
        return map;
    }
    @PostMapping("addAoyoCouponNew")
    public Result addAoyoCouponNew(AoyoCouponNew couponNew){
        couponNew.setGroupId(99);
        couponNew.setCouponNewStatusAtribute(couponNew.getCouponNewCount());
        int i =aoyoCouponNewService.addAoyoCouponNew(couponNew);
        if (i==0){
            return new Result(false,-1,"插入失败");
        }
        return new Result(true,200,"插入成功");
    }
    @PostMapping("uptformContent")
    public Result uptformContent(AoyoCouponNew couponNew){
        int i =aoyoCouponNewService.uptformContent(couponNew);
        if (i==0){
            return new Result(false,-1,"修改失败");
        }
        return new Result(true,200,"修改成功");
    }
    @PostMapping("upDeleteCoupons")
    public Result upDeleteCoupons(@Param("ids") String ids){
        String[] split = ids.split(",");
        int[] array = Arrays.asList(split).stream().mapToInt(Integer::parseInt).toArray();
        int i =aoyoCouponNewService.upDeleteCoupons(array);
        if (i==0){
            return new Result(false,-1,"删除失败");
        }
        return new Result(true,200,"删除成功");
    }
}
