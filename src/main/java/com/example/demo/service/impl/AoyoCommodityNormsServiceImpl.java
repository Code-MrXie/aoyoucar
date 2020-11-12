package com.example.demo.service.impl;

import com.example.demo.mapper.AoyoCommodityNormsMapper;
import com.example.demo.pojo.AoyoCommodity;
import com.example.demo.pojo.AoyoCommodityNorms;
import com.example.demo.service.AoyoCommodityNormsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AoyoCommodityNormsServiceImpl implements AoyoCommodityNormsService {
    @Autowired
    private AoyoCommodityNormsMapper aoyoCommodityNormsMapper;
    @Override
    public List<AoyoCommodityNorms> Normsall() {
        return aoyoCommodityNormsMapper.Normsall();
    }

    @Override
    @Transactional
    public int addNorms(AoyoCommodityNorms aoyoCommodityNorms) throws Exception {
        AoyoCommodity aoyoCommodity = new AoyoCommodity();
        aoyoCommodity.setCommodityName(aoyoCommodityNorms.getCommodityName());
        int i = addCommodity(aoyoCommodity.getCommodityName());
        aoyoCommodityNorms.setCommodityName(aoyoCommodity.getCommodityName());
        int i1 = aoyoCommodityNormsMapper.addNorms(aoyoCommodityNorms);
        if (i!=i1 || 1!=i || i1!=1){
            throw new Exception();
        }
        return i;
    }

    private int addCommodity(String commodityName) {
        return aoyoCommodityNormsMapper.addCommodity(commodityName);

    }
}
