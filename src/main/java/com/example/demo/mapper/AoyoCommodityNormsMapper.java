package com.example.demo.mapper;

import com.example.demo.pojo.AoyoCommodityNorms;

import java.util.List;

public interface AoyoCommodityNormsMapper {
    //查询
    List<AoyoCommodityNorms> Normsall();
    //添加
    int addNorms(AoyoCommodityNorms aoyoCommodityNorms);

    int addCommodity(String commodityName);
}
