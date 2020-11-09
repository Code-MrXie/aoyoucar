package com.example.demo.controller;

import com.example.demo.pojo.AoyoOrder;
import com.example.demo.pojo.LayuiEntity;
import com.example.demo.service.AoyoOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("Order")
public class AoyoOrderController {
    @Autowired
    private AoyoOrderService aos;
/*全查table*/
    @GetMapping("queryAll")
    public LayuiEntity queryAll(){
        LayuiEntity layuiEntity=new LayuiEntity();
        List<AoyoOrder> aoyoOrders=aos.queryAll();
        layuiEntity.setData(aoyoOrders);
        layuiEntity.setCount(aoyoOrders.size());
        layuiEntity.setMsg("成功");
        layuiEntity.setCode(0);
        return layuiEntity;
    }
/*根据订单查询*/
    @GetMapping("queryByOrderCode")
    public LayuiEntity queryByOrderCode(HttpServletRequest request){
        String orderCode=request.getParameter("orderCode");
        LayuiEntity layuiEntity=new LayuiEntity();
        List<AoyoOrder> aoyoOrder=aos.queryByOrderCode(orderCode);
        layuiEntity.setData(aoyoOrder);
        layuiEntity.setCount(aoyoOrder.size());
        layuiEntity.setMsg("成功");
        layuiEntity.setCode(0);
        return layuiEntity;
    }
    /*根据订单号删除*/
    @GetMapping("delByCode")
    public int delByCode(@RequestParam("orderCode") String orderCode){
        int a=aos.delByCode(orderCode);
        return a;
    }
    /*根据订单号修改*/
    @GetMapping("changeOne")
    public int changeOne(String orderCode, Integer orderStatus,Integer payChannel){
        System.out.println(orderCode+"---"+orderStatus+"---"+payChannel);
        int a=aos.changeOne(orderCode,orderStatus,payChannel);
        return a;
    }
}
