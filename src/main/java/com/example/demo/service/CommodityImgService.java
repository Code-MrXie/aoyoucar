package com.example.demo.service;

import com.example.demo.pojo.AoyoCommodityImg;
import com.github.pagehelper.PageInfo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CommodityImgService {
    PageInfo<AoyoCommodityImg> queryComodityImgList(AoyoCommodityImg aoyoCommodityImg);

    int addComodityImg(AoyoCommodityImg aoyoCommodityImg, MultipartFile lunboFile) throws IOException;

    int updComodityImg(AoyoCommodityImg aoyoCommodityImg, MultipartFile lunboFile) throws IOException;

    int upDeleteCommodityImg(int[] array);
}
