package com.example.demo.service;

import com.example.demo.pojo.AoyoCommodity;

import java.util.List;

public interface AoyoCommodityService {
    List<AoyoCommodity>Commodityall();
    AoyoCommodity showDetailById(Integer id);
    int addCommoditys(AoyoCommodity aoyoCommodity) throws Exception;
}
