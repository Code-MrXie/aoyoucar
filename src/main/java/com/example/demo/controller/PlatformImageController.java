package com.example.demo.controller;

import com.example.demo.pojo.AoyoCommodityImg;
import com.example.demo.pojo.AoyoPlatformImage;
import com.example.demo.service.PlatformImageService;
import com.example.demo.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/platformImage")
public class PlatformImageController {
    @Autowired
    private PlatformImageService platformImageService;
    @RequestMapping("queryplatformImages")
    public Map queryplatformImages(AoyoPlatformImage aoyoPlatformImage){
        PageInfo<AoyoPlatformImage> pageHelper=platformImageService.queryplatformImages(aoyoPlatformImage);
        Map map = new HashMap();
        map.put("msg","查询成功");
        map.put("count",pageHelper.getTotal());
        map.put("code",0);
        map.put("data",pageHelper.getList());
        return map;
    }
    @RequestMapping("/addPlatformImage")
    public Result addPlatformImage(AoyoPlatformImage aoyoPlatformImage, @RequestPart("platformFile") MultipartFile platformFile) throws IOException {
        int i = platformImageService.addPlatformImage(aoyoPlatformImage,platformFile);
        if (i==0){
            return new Result(false,-1,"添加失败");
        }
        return new Result(true,200,"添加成功");
    }
    @RequestMapping("/upDeleteplatformImage")
    public Result upDeleteplatformImage(@Param("ids") String ids) {
        String[] split = ids.split(",");
        int[] array = Arrays.asList(split).stream().mapToInt(Integer::parseInt).toArray();
        int i = platformImageService.upDeleteplatformImage(array);
        if (i==0){
            return new Result(false,-1,"添加失败");
        }
        return new Result(true,200,"添加成功");
    }

}
