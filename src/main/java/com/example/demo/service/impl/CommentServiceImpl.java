package com.example.demo.service.impl;

import com.example.demo.mapper.CommentMapper;
import com.example.demo.pojo.AoyoCommodityComment;

import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public List<AoyoCommodityComment> commentall() {
        return commentMapper.commentall();
    }
}
