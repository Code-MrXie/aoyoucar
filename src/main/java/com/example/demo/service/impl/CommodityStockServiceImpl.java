package com.example.demo.service.impl;

import com.example.demo.mapper.CommodityStockMapper;
import com.example.demo.pojo.AoyoCommodity;
import com.example.demo.pojo.AoyoCommodityNorms;
import com.example.demo.pojo.AoyoCommodityStock;
import com.example.demo.service.CommodityStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CommodityStockServiceImpl implements CommodityStockService {
    @Autowired
    private CommodityStockMapper commodityStockMapper;
    @Override
    public List<AoyoCommodityStock> Stockall() {
        return commodityStockMapper.Stockall();
    }


    @Override
    @Transactional
    public int StockAdd(AoyoCommodityStock aoyoCommodityStock) throws Exception {
        AoyoCommodity aoyoCommodity = new AoyoCommodity();
        aoyoCommodity.setCommodityName(aoyoCommodityStock.getCommodityName());
        int i = addCommodity(aoyoCommodity.getCommodityName());
        aoyoCommodityStock.setCommodityName(aoyoCommodity.getCommodityName());
        int i1 = commodityStockMapper.StockAdd(aoyoCommodityStock);
        System.out.println(i1);
        if ( 0==i || i1==0){
            throw new Exception();
        }
        return i;
    }

    private int addCommodity(String commodityName) {
        return commodityStockMapper.addCommodity(commodityName);

    }

}
