package com.example.demo.service.impl;

import com.example.demo.mapper.AoyoCouponNewMapper;
import com.example.demo.pojo.AoyoCouponNew;
import com.example.demo.service.AoyoCouponNewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AoyoCouponNewServiceImpl implements AoyoCouponNewService {
    @Autowired
    private AoyoCouponNewMapper aoyoCouponNewMapper;
    @Override
    public PageInfo<AoyoCouponNew> queryAoyoCouponNewList(AoyoCouponNew couponNew) {
        PageHelper.startPage(couponNew.getPage(),couponNew.getLimit());
        List<AoyoCouponNew> aoyoCouponNews = aoyoCouponNewMapper.queryAoyoCouponNewList(couponNew);
        PageInfo aoyoCouponNewsPageInfo = new PageInfo(aoyoCouponNews);
        return aoyoCouponNewsPageInfo;
    }

    @Override
    public int addAoyoCouponNew(AoyoCouponNew couponNew) {
        return aoyoCouponNewMapper.addAoyoCouponNew(couponNew);
    }
}
