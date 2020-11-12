package com.example.demo.pojo;

import lombok.Data;

@Data
public class AoyoGroupComment {

  private long groupCommentId;
  private long groupId;
  private long orderId;
  private long customId;
  private String groupCommentTitle;
  private String groupCommentContent;
  private java.sql.Timestamp groupCommentTime;
  private java.sql.Timestamp groupCommentLastupdateTime;
  private String groupCommentRemarks;
  private long pingfen;
  private long deleteFlag;



}
