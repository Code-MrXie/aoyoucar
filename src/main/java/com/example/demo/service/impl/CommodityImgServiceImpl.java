package com.example.demo.service.impl;

import com.example.demo.mapper.CommodityImgMapper;
import com.example.demo.pojo.AoyoCommodityImg;
import com.example.demo.service.CommodityImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityImgServiceImpl implements CommodityImgService {
    @Autowired
    private CommodityImgMapper commodityImgMapper;

    @Override
    public List<AoyoCommodityImg> queryComodityImgList() {
        return commodityImgMapper.queryComodityImgList();
    }
}
