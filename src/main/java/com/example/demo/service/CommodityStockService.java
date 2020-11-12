package com.example.demo.service;

import com.example.demo.pojo.AoyoCommodityNorms;
import com.example.demo.pojo.AoyoCommodityStock;

import java.util.List;

public interface CommodityStockService {
    List<AoyoCommodityStock> Stockall();

    int StockAdd(AoyoCommodityStock aoyoCommodityStock) throws Exception;
}
