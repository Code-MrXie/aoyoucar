package com.example.demo.controller;

import com.example.demo.pojo.AoyoOrder;
import com.example.demo.service.AoyoOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Order")
public class AoyoOrderController {
    @Autowired
    private AoyoOrderService aos;
    @PostMapping("queryAll")
    public List<AoyoOrder> queryAll(){
        List<AoyoOrder> aoyoOrders=aos.queryAll();
        return aoyoOrders;
    }
}
