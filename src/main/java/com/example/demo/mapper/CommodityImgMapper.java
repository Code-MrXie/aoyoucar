package com.example.demo.mapper;

import com.example.demo.pojo.AoyoCommodityImg;

import java.util.List;

public interface CommodityImgMapper {
    List<AoyoCommodityImg> queryComodityImgList();

    int addComodityImg(AoyoCommodityImg aoyoCommodityImg);

    int updComodityImg(AoyoCommodityImg aoyoCommodityImg);

    int upDeleteCommodityImg(int[] array);
}
