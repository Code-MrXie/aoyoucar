package com.example.demo.mapper;

import com.example.demo.pojo.AoyoCommodityClass;
import com.example.demo.pojo.CarBrand;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AoyoClassifyMapper {
    List<AoyoCommodityClass> CommodityCLass();

    int deleteClass(Integer classId);

    //Integer updateClass(Integer classId);

    //修改查询
    AoyoCommodityClass selectByClassId(Integer classId);

    Integer updateClass(AoyoCommodityClass aoyoCommodityClass);

    AoyoCommodityClass addClass(AoyoCommodityClass aoyoCommodityClass);

    List<CarBrand> CarList();

    int deleteCar(Integer carBrandId);

    CarBrand selectCarById(Integer carBrandId);

    Integer updateCar(CarBrand carBrand);

    CarBrand addCar(CarBrand carBrand);
}
