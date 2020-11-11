package com.example.demo.controller;

import com.example.demo.pojo.AoyoCommodityImg;
import com.example.demo.pojo.AoyoCouponNew;
import com.example.demo.service.CommodityImgService;
import com.example.demo.utils.AliyunOSSUtil;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageInfo;
import org.apache.commons.io.FileUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/comodityImg")
public class CommodityImgController {
    @Autowired
    private CommodityImgService commodityImgService;
    @RequestMapping("/queryComodityImgList")
    public Map queryComodityImgList(AoyoCommodityImg aoyoCommodityImg){
        PageInfo<AoyoCommodityImg> couponNews= commodityImgService.queryComodityImgList(aoyoCommodityImg);
        Map map = new HashMap();
        map.put("data",couponNews.getList());
        map.put("count",couponNews.getTotal());
        map.put("code",0);
        map.put("msg","查询成功");
        return map;
    }
    @RequestMapping("/addComodityImg")
    public Result addComodityImg(AoyoCommodityImg aoyoCommodityImg, @RequestPart("lunboFile") MultipartFile lunboFile,HttpServletRequest request) throws IOException {
        aoyoCommodityImg.setLunboStatus(1);
        int i = commodityImgService.addComodityImg(aoyoCommodityImg,lunboFile);
        if (i==0){
            return new Result(false,-1,"添加失败");
        }
        return new Result(true,200,"添加成功");
    }
    @RequestMapping("/updComodityImg")
    public Result updComodityImg(AoyoCommodityImg aoyoCommodityImg, @RequestPart("lunboFile") MultipartFile lunboFile,HttpServletRequest request) throws IOException {
        int i = commodityImgService.updComodityImg(aoyoCommodityImg,lunboFile);
        if (i==0){
            return new Result(false,-1,"修改失败");
        }
        return new Result(true,200,"修改成功");
    }
    @RequestMapping("/upDeleteCommodityImg")
    public Result upDeleteCommodityImg(@Param("ids") String ids)  {
        String[] split = ids.split(",");
        int[] array = Arrays.asList(split).stream().mapToInt(Integer::parseInt).toArray();
        int i =commodityImgService.upDeleteCommodityImg(array);
        if (i==0){
            return new Result(false,-1,"删除失败");
        }
        return new Result(true,200,"删除成功");
    }
}
