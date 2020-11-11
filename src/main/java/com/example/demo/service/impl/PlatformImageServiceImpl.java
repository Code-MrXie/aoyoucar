package com.example.demo.service.impl;

import com.example.demo.mapper.PlatformImageMapper;
import com.example.demo.pojo.AoyoCommodityImg;
import com.example.demo.pojo.AoyoPlatformImage;
import com.example.demo.service.PlatformImageService;
import com.example.demo.utils.AliyunOSSUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class PlatformImageServiceImpl implements PlatformImageService {
    @Autowired
    private PlatformImageMapper platformImageMapper;

    @Override
    public PageInfo<AoyoPlatformImage> queryplatformImages(AoyoPlatformImage aoyoPlatformImage) {
        PageHelper.startPage(aoyoPlatformImage.getPage(),aoyoPlatformImage.getLimit());
        List<AoyoPlatformImage> aoyoPlatformImages = platformImageMapper.queryplatformImages();
        PageInfo info =new PageInfo(aoyoPlatformImages);
        return info;
    }

    @Override
    public int addPlatformImage(AoyoPlatformImage aoyoPlatformImage, MultipartFile platformFile) throws IOException {
        String imagename = platformFile.getOriginalFilename();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String str = format.format(new Date());
        if (!StringUtils.isBlank(imagename)){
            File filename = new File(str+imagename);
            FileUtils.copyInputStreamToFile(platformFile.getInputStream(),filename);
            String imageurl= AliyunOSSUtil.upload(filename);
            aoyoPlatformImage.setPlatformImageUri("https://oss-xys.oss-cn-beijing.aliyuncs.com/"+imageurl);
        }
        int i = 0;
        if (aoyoPlatformImage.getPlatformImageId()==null){
            i =platformImageMapper.maxSerialNumber(aoyoPlatformImage.getPlatformImageId());
            aoyoPlatformImage.setSerialNumber(i+1);
        }else{
            i =platformImageMapper.maxSerialNumber(aoyoPlatformImage.getPlatformImageId());
        }
        aoyoPlatformImage.setSerialNumber(i);
        return platformImageMapper.addPlatformImage(aoyoPlatformImage);
    }

    @Override
    public int upDeleteplatformImage(int[] array) {
        return platformImageMapper.upDeleteplatformImage(array);
    }
}
