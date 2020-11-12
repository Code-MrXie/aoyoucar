package com.example.demo.service.impl;

import com.example.demo.mapper.AoyoMerchantMapper;
import com.example.demo.pojo.AoyoMerchant;
import com.example.demo.service.AoyoMerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AoyoMerchantServiceImpl implements AoyoMerchantService {
    @Autowired
    private AoyoMerchantMapper aoyoMerchantMapper;
    @Override
    public List<AoyoMerchant> informationall() {
        return aoyoMerchantMapper.informationall();
    }
}
