package com.example.demo.mapper;

import com.example.demo.pojo.AoyoUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AoyoUderMapper {
    AoyoUser LoginUser(@Param("aoyoName") String aoyoName, @Param("aoyoPassword")String aoyoPassword);
}
