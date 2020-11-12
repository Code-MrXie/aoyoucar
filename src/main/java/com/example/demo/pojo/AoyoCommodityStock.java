package com.example.demo.pojo;

import lombok.Data;

@Data
public class AoyoCommodityStock {

  private long commodityStockId;
  private long commodityId;
  private long groupId;
  private String commodityStockTypeName;
  private long commodityStockNumber;
  private long deleteFlag;
  private String commodityName;


}
