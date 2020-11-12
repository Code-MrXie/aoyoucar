package com.example.demo.service;

import com.example.demo.pojo.AoyoCommodityClass;
import com.example.demo.pojo.CarBrand;

import java.util.List;

public interface AoyoClassifyService {
    List<AoyoCommodityClass> CommodityCLass();

    int deleteClass(Integer classId);

    AoyoCommodityClass selectByClassId(Integer classId);

    Integer updateClass(AoyoCommodityClass aoyoCommodityClass);

    AoyoCommodityClass addClass(AoyoCommodityClass aoyoCommodityClass);


    List<CarBrand> CarList();

    int deleteCar(Integer carBrandId);

    CarBrand selectCarById(Integer carBrandId);

    Integer updateCar(CarBrand carBrand);

    CarBrand addCar(CarBrand carBrand);
}
