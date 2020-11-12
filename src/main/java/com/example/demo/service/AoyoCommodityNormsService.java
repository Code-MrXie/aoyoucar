package com.example.demo.service;

import com.example.demo.pojo.AoyoCommodity;
import com.example.demo.pojo.AoyoCommodityNorms;

import java.util.List;

public interface AoyoCommodityNormsService {
    List<AoyoCommodityNorms> Normsall();
    int addNorms(AoyoCommodityNorms aoyoCommodityNorms) throws Exception;
}
