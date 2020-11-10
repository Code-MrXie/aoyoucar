package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AoyoCouponNew {
  private Integer couponNewId;
  private String couponNewName;
  private Integer couponNewCount;
  private Integer couponNewTypeId;
  private double couponNewTypeAtribute;
  private Integer couponNewRebateMax;
  private Integer couponNewSill;
  private Integer couponNewSillNum;
  private String couponNewDesc;
  private Integer couponNewStatus;
  private Integer couponNewStatusAtribute;
  private Integer groupId;
  private Integer couponNewLimit;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date couponNewStartTime;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date couponNewEndTime;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date couponNewCreateTime;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private String couponNewOver;
  private Integer deleteFlag;
  private AoyoCouponNewType aoyoCouponNewType;
  private AoyoCoupon aoyoCoupon;
  private SysGroup sysGroup;
  private Integer page;
  private Integer limit;
  private String groupName;
}
