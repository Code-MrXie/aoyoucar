package com.example.demo.service;

import com.example.demo.pojo.AoyoCouponNew;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface AoyoCouponNewService {
    PageInfo<AoyoCouponNew> queryAoyoCouponNewList(AoyoCouponNew couponNew);

    int addAoyoCouponNew(AoyoCouponNew couponNew);

    int uptformContent(AoyoCouponNew couponNew);

    int upDeleteCoupons(int[] ids);

    List<AoyoCouponNew> queryCouponNewList();
}
