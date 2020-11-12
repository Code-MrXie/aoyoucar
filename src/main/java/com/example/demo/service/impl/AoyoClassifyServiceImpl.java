package com.example.demo.service.impl;

import com.example.demo.mapper.AoyoClassifyMapper;
import com.example.demo.pojo.AoyoCommodityClass;
import com.example.demo.pojo.CarBrand;
import com.example.demo.service.AoyoClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AoyoClassifyServiceImpl implements AoyoClassifyService {
    @Autowired
    private AoyoClassifyMapper aoyoClassifyMapper;
    @Override
    public List<AoyoCommodityClass> CommodityCLass() {

        return aoyoClassifyMapper.CommodityCLass();
    }

    @Override
    public int deleteClass(Integer classId) {
        return aoyoClassifyMapper.deleteClass(classId);
    }

    @Override
    public AoyoCommodityClass selectByClassId(Integer classId) {

        return aoyoClassifyMapper.selectByClassId(classId);
    }

    @Override
    public Integer updateClass(AoyoCommodityClass aoyoCommodityClass) {
        return aoyoClassifyMapper.updateClass(aoyoCommodityClass);
    }

    @Override
    public AoyoCommodityClass addClass(AoyoCommodityClass aoyoCommodityClass) {
        return aoyoClassifyMapper.addClass(aoyoCommodityClass);
    }

    @Override
    public List<CarBrand> CarList() {
        return aoyoClassifyMapper.CarList();
    }

    @Override
    public int deleteCar(Integer carBrandId) {
        return aoyoClassifyMapper.deleteCar(carBrandId);
    }

    @Override
    public CarBrand selectCarById(Integer carBrandId) {
        return aoyoClassifyMapper.selectCarById(carBrandId);
    }

    @Override
    public Integer updateCar(CarBrand carBrand) {
        return aoyoClassifyMapper.updateCar(carBrand);
    }

    @Override
    public CarBrand addCar(CarBrand carBrand) {
        return aoyoClassifyMapper.addCar(carBrand);
    }
}
