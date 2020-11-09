package com.example.demo.service;

import com.example.demo.pojo.AoyoOrder;

import java.util.List;

public interface AoyoOrderService {
    List<AoyoOrder> queryAll( );

    List<AoyoOrder> queryByOrderCode(String orderCode);

    int delByCode(String orderCode);

    int changeOne(String orderCode, Integer orderStatus,Integer payChannel);
}
