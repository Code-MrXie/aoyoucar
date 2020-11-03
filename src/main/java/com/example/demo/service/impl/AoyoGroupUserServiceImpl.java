package com.example.demo.service.impl;

import com.example.demo.mapper.AoyoGroupUderMapper;
import com.example.demo.pojo.AoyoGroupUser;
import com.example.demo.pojo.AoyoUser;
import com.example.demo.service.AoyoGroupUserService;
import com.example.demo.service.AoyoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AoyoGroupUserServiceImpl implements AoyoGroupUserService {
@Autowired
private AoyoGroupUderMapper aoyoGroupUderMapper;
    @Override
    public List<AoyoGroupUser> useralls() {
        return aoyoGroupUderMapper.useralls();
    }
}
