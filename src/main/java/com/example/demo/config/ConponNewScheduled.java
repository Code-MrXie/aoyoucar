package com.example.demo.config;

import com.example.demo.pojo.AoyoCouponNew;
import com.example.demo.service.AoyoCouponNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class ConponNewScheduled {
    @Autowired
    private AoyoCouponNewService aoyoCouponNewService;
    @Scheduled(cron = "0/10 * * * * ?")
    public void updCouponNewStatus(){
        /**
         * 查询数据库的优惠券
         *      查询到优惠券的开始时间小于当前时间，将优惠券的状态设为1，已发放，
         *      查询到优惠券的结束时间大于当前时间，将优惠券的状态改为-1，已结束
         *AoyoCouponNew
         */
        List<AoyoCouponNew> aoyoCouponNews = aoyoCouponNewService.queryCouponNewList();
        Date date = new Date();
        try {
            for (AoyoCouponNew aoyoCouponNew : aoyoCouponNews) {
               /* if (aoyoCouponNew.getCouponNewStartTime() < date.getTime()){

                }*/
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
