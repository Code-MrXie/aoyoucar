package com.example.demo.service.impl;

import com.example.demo.mapper.CommodityImgMapper;
import com.example.demo.pojo.AoyoCommodityImg;
import com.example.demo.pojo.AoyoCouponNew;
import com.example.demo.service.CommodityImgService;
import com.example.demo.utils.AliyunOSSUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CommodityImgServiceImpl implements CommodityImgService {
    @Autowired
    private CommodityImgMapper commodityImgMapper;

    @Override
    public PageInfo<AoyoCommodityImg> queryComodityImgList(AoyoCommodityImg aoyoCommodityImg) {
        PageHelper.startPage(aoyoCommodityImg.getPage(),aoyoCommodityImg.getLimit());
        List<AoyoCommodityImg> commodityImgList = commodityImgMapper.queryComodityImgList();
        PageInfo info = new PageInfo(commodityImgList);
        return info;
    }

    @Override
    public int addComodityImg(AoyoCommodityImg aoyoCommodityImg, MultipartFile lunboFile) throws IOException {
        String imagename = lunboFile.getOriginalFilename();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String str = format.format(new Date());
        File filename = new File(str+imagename);
        FileUtils.copyInputStreamToFile(lunboFile.getInputStream(),filename);
        String imageurl= AliyunOSSUtil.upload(filename);
        aoyoCommodityImg.setCommodityImgUrl("https://oss-xys.oss-cn-beijing.aliyuncs.com/"+imageurl);
        return commodityImgMapper.addComodityImg(aoyoCommodityImg);
    }
    @Override
    public int updComodityImg(AoyoCommodityImg aoyoCommodityImg, MultipartFile lunboFile) throws IOException {
        String imagename = lunboFile.getOriginalFilename();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String str = format.format(new Date());
        File filename = new File(str+imagename);
        FileUtils.copyInputStreamToFile(lunboFile.getInputStream(),filename);
        String imageurl= AliyunOSSUtil.upload(filename);
        aoyoCommodityImg.setCommodityImgUrl("https://oss-xys.oss-cn-beijing.aliyuncs.com/"+imageurl);
        return commodityImgMapper.updComodityImg(aoyoCommodityImg);
    }

    @Override
    public int upDeleteCommodityImg(int[] array) {
        return commodityImgMapper.upDeleteCommodityImg(array);
    }


}
