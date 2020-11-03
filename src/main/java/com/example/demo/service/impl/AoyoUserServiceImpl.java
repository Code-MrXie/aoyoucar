package com.example.demo.service.impl;

import com.example.demo.mapper.AoyoUderMapper;
import com.example.demo.pojo.AoyoUser;
import com.example.demo.service.AoyoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AoyoUserServiceImpl implements AoyoUserService {
    @Autowired
    private AoyoUderMapper aoyoUderMapper;
    @Override
    public AoyoUser LoginUser(String aoyoName, String aoyoPassword) {
        AoyoUser aoyoUser = aoyoUderMapper.LoginUser(aoyoName, aoyoPassword);
        System.out.println(aoyoUser);
        return aoyoUser;
    }
}
