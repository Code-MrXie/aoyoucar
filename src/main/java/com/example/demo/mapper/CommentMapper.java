package com.example.demo.mapper;

import com.example.demo.pojo.AoyoCommodityComment;
import com.example.demo.pojo.AoyoGroupComment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CommentMapper {
    List<AoyoCommodityComment> commentall();
}
