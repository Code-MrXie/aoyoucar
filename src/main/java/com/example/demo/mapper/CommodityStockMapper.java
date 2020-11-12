package com.example.demo.mapper;

import com.example.demo.pojo.AoyoCommodityNorms;
import com.example.demo.pojo.AoyoCommodityStock;

import java.util.List;

public interface CommodityStockMapper {
    List<AoyoCommodityStock> Stockall();
    int StockAdd(AoyoCommodityStock aoyoCommodityStock);

    int addCommodity(String commodityName);
}
