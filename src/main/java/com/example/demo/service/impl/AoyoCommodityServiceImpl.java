package com.example.demo.service.impl;

import com.example.demo.mapper.AoyoCommodityMapper;
import com.example.demo.pojo.AoyoCommodity;
import com.example.demo.pojo.AoyoCommodityStock;
import com.example.demo.service.AoyoCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AoyoCommodityServiceImpl implements AoyoCommodityService {
    @Autowired
    private AoyoCommodityMapper aoyoCommodityMapper;
    @Override
    public List<AoyoCommodity> Commodityall() {
        return aoyoCommodityMapper.Commodityall();
    }

    @Override
    public AoyoCommodity showDetailById(Integer id) {
        return aoyoCommodityMapper.showDetailById(id);
    }


    @Override
    @Transactional
    public int addCommoditys(AoyoCommodity aoyoCommodity) throws Exception {
        return  aoyoCommodityMapper.addCommoditys(aoyoCommodity);
    }

}
