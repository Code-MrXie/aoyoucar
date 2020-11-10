package com.example.demo.mapper;

import com.example.demo.pojo.AoyoCouponNew;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AoyoCouponNewMapper {
    List<AoyoCouponNew> queryAoyoCouponNewList(AoyoCouponNew couponNew);

    int addAoyoCouponNew(AoyoCouponNew couponNew);

    int uptformContent(AoyoCouponNew couponNew);

    int upDeleteCoupons(int[] ids);

    List<AoyoCouponNew> queryCouponNewList();
}
