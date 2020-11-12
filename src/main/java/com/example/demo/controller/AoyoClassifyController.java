package com.example.demo.controller;

import com.example.demo.pojo.AoyoCommodity;
import com.example.demo.pojo.AoyoCommodityClass;
import com.example.demo.pojo.CarBrand;
import com.example.demo.pojo.LayuiEntity;
import com.example.demo.service.AoyoClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Classify")
public class AoyoClassifyController {
    @Autowired
    private AoyoClassifyService aoyoClassifyService;
    //列表查
    @GetMapping("CommodityCLass")
    public LayuiEntity CommodityCLass() {
        LayuiEntity layuiEntity = new LayuiEntity();
        List<AoyoCommodityClass> CommodityCLass = aoyoClassifyService.CommodityCLass();
        layuiEntity.setData(CommodityCLass);
        layuiEntity.setCount(CommodityCLass.size());
        layuiEntity.setMsg("成功");
        layuiEntity.setCode(0);
        return layuiEntity;

    }
    //删除
    @RequestMapping("deleteClass")
    public boolean deleteClass(Integer classId){
        int i = aoyoClassifyService.deleteClass(classId);
        return i>0;
    }

    //修改单查
    @RequestMapping("selectByClassId")
    public AoyoCommodityClass selectByClassId(Integer classId){
        return  aoyoClassifyService.selectByClassId(classId);

    }
    //修改
    @PostMapping("updateClass")
    public Integer updateClass(AoyoCommodityClass aoyoCommodityClass) {
        System.out.println(aoyoCommodityClass);
        return aoyoClassifyService.updateClass(aoyoCommodityClass);
    }
    //添加
    @PostMapping("addClass")
    public AoyoCommodityClass addClass(AoyoCommodityClass aoyoCommodityClass){
        return  aoyoClassifyService.addClass(aoyoCommodityClass);

    }



    //列表查
    @GetMapping("CarList")
    public LayuiEntity CarList() {
        LayuiEntity layuiEntity = new LayuiEntity();
        List<CarBrand> CarList = aoyoClassifyService.CarList();
        layuiEntity.setData(CarList);
        layuiEntity.setCount(CarList.size());
        layuiEntity.setMsg("成功");
        layuiEntity.setCode(0);
        return layuiEntity;

    }
    //删除
    @RequestMapping("deleteCar")
    public boolean deleteCar(Integer carBrandId){
        int i = aoyoClassifyService.deleteCar(carBrandId);
        return i>0;
    }

    //修改单查
    @RequestMapping("selectCarById")
    public CarBrand selectCarById(Integer carBrandId){
        return  aoyoClassifyService.selectCarById(carBrandId);

    }
    //修改
    @PostMapping("updateCar")
    public Integer updateCar(CarBrand carBrand) {

        return aoyoClassifyService.updateCar(carBrand);
    }
    //添加
    @PostMapping("addCar")
    public CarBrand addCar(CarBrand carBrand){
        return  aoyoClassifyService.addCar(carBrand);

    }
}
