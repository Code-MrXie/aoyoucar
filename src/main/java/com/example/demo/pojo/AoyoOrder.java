package com.example.demo.pojo;


import lombok.Data;
import lombok.ToString;

import java.util.Date ;
@Data
@ToString
public class AoyoOrder {

  private Integer orderId;
  private Integer groupId;
  private String orderCode;
  private Integer commodityId;
  private Integer customId;
  private Integer sendOrderStatus;
  private Integer payChannel;
  private double orderAmount;
  private Integer couponId;
  private double discountAmount;
  private double freightAmount;
  private double orderPracticalAmount;
  private Date  orderInputTime;
  private Date  orderSettlementTime;
  private Date  orderDeliveryTime;
  private Date  orderReceivingTime;
  private Integer invoiceState;
  private String orderPayNumber;
  private Integer addressId;
  private String trackingNumber;
  private Integer groupEnjoy;
  private Integer groupOrderReceiving;
  private Integer recordDateId;
  private Integer deleteFlag;
  private String commodity_name;
  private String group_name;
  private String aoyo_nikeName;
  private String aoyo_name;
}
