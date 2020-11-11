package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

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

  public Integer getCouponNewId() {
    return couponNewId;
  }

  public void setCouponNewId(Integer couponNewId) {
    this.couponNewId = couponNewId;
  }

  public String getCouponNewName() {
    return couponNewName;
  }

  public void setCouponNewName(String couponNewName) {
    this.couponNewName = couponNewName;
  }

  public Integer getCouponNewCount() {
    return couponNewCount;
  }

  public void setCouponNewCount(Integer couponNewCount) {
    this.couponNewCount = couponNewCount;
  }

  public Integer getCouponNewTypeId() {
    return couponNewTypeId;
  }

  public void setCouponNewTypeId(Integer couponNewTypeId) {
    this.couponNewTypeId = couponNewTypeId;
  }

  public double getCouponNewTypeAtribute() {
    return couponNewTypeAtribute;
  }

  public void setCouponNewTypeAtribute(double couponNewTypeAtribute) {
    this.couponNewTypeAtribute = couponNewTypeAtribute;
  }

  public Integer getCouponNewRebateMax() {
    return couponNewRebateMax;
  }

  public void setCouponNewRebateMax(Integer couponNewRebateMax) {
    this.couponNewRebateMax = couponNewRebateMax;
  }

  public Integer getCouponNewSill() {
    return couponNewSill;
  }

  public void setCouponNewSill(Integer couponNewSill) {
    this.couponNewSill = couponNewSill;
  }

  public Integer getCouponNewSillNum() {
    return couponNewSillNum;
  }

  public void setCouponNewSillNum(Integer couponNewSillNum) {
    this.couponNewSillNum = couponNewSillNum;
  }

  public String getCouponNewDesc() {
    return couponNewDesc;
  }

  public void setCouponNewDesc(String couponNewDesc) {
    this.couponNewDesc = couponNewDesc;
  }

  public Integer getCouponNewStatus() {
    return couponNewStatus;
  }

  public void setCouponNewStatus(Integer couponNewStatus) {
    this.couponNewStatus = couponNewStatus;
  }

  public Integer getCouponNewStatusAtribute() {
    return couponNewStatusAtribute;
  }

  public void setCouponNewStatusAtribute(Integer couponNewStatusAtribute) {
    this.couponNewStatusAtribute = couponNewStatusAtribute;
  }

  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public Integer getCouponNewLimit() {
    return couponNewLimit;
  }

  public void setCouponNewLimit(Integer couponNewLimit) {
    this.couponNewLimit = couponNewLimit;
  }

  public Date getCouponNewStartTime() {
    return couponNewStartTime;
  }

  public void setCouponNewStartTime(Date couponNewStartTime) {
    this.couponNewStartTime = couponNewStartTime;
  }

  public Date getCouponNewEndTime() {
    return couponNewEndTime;
  }

  public void setCouponNewEndTime(Date couponNewEndTime) {
    this.couponNewEndTime = couponNewEndTime;
  }

  public Date getCouponNewCreateTime() {
    return couponNewCreateTime;
  }

  public void setCouponNewCreateTime(Date couponNewCreateTime) {
    this.couponNewCreateTime = couponNewCreateTime;
  }

  public String getCouponNewOver() {
    return couponNewOver;
  }

  public void setCouponNewOver(String couponNewOver) {
    this.couponNewOver = couponNewOver;
  }

  public Integer getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(Integer deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

  public AoyoCouponNewType getAoyoCouponNewType() {
    return aoyoCouponNewType;
  }

  public void setAoyoCouponNewType(AoyoCouponNewType aoyoCouponNewType) {
    this.aoyoCouponNewType = aoyoCouponNewType;
  }

  public AoyoCoupon getAoyoCoupon() {
    return aoyoCoupon;
  }

  public void setAoyoCoupon(AoyoCoupon aoyoCoupon) {
    this.aoyoCoupon = aoyoCoupon;
  }

  public SysGroup getSysGroup() {
    return sysGroup;
  }

  public void setSysGroup(SysGroup sysGroup) {
    this.sysGroup = sysGroup;
  }

  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }
}
