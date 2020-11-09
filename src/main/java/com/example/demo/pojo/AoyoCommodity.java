package com.example.demo.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AoyoCommodity {

  private long commodityId;
  private String commodityNumber;
  private String commodityName;
  private long brandId;
  private long typeId;
  private long groupId;
  private double commdityWeight;
  private double commoditySellingPrice;
  private double commodityCostPrice;
  private long commodityStatus;
  private java.sql.Timestamp commodityComeOutTime;
  private String commodityDesc;
  private java.sql.Timestamp commodityEntry;
  private java.sql.Timestamp commodityLastupdateTime;
  private long commoditySort;
  private long deleteFlag;
  private long commoditySuitId;
  private long commodityImgId;


}
