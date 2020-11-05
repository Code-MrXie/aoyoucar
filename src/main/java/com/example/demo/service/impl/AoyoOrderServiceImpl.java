package com.example.demo.service.impl;

import com.example.demo.mapper.AoyoOrderMapper;
import com.example.demo.pojo.AoyoOrder;
import com.example.demo.service.AoyoOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AoyoOrderServiceImpl implements AoyoOrderService {
    @Autowired
    private AoyoOrderMapper aom;

    @Override
    public List<AoyoOrder> queryAll() {
        return aom.queryAll();
    }
}
