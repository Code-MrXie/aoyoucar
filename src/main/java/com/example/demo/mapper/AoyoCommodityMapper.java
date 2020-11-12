package com.example.demo.mapper;

import com.example.demo.pojo.AoyoCommodity;
import com.example.demo.pojo.AoyoCommodityNorms;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AoyoCommodityMapper {
    List<AoyoCommodity> Commodityall();
    AoyoCommodity showDetailById(Integer id);
    int addCommoditys(AoyoCommodity aoyoCommodity);
}
