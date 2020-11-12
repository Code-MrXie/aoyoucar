package com.example.demo.pojo;

import lombok.Data;

@Data
public class AoyoCommodityComment {

  private long commodityCommentId;
  private long commodityId;
  private long orderId;
  private long customId;
  private String commodityCommentTitle;
  private String commodityCommentContent;
  private java.sql.Timestamp commodityCommentTime;
  private java.sql.Timestamp commodityCommentLastupdateTime;
  private String commodityCommentRemarks;
  private long deleteFlag;
  private String commodityName;
  private String name;
  private String orderCode;

}
