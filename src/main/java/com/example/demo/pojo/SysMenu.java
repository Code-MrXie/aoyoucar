package com.example.demo.pojo;

import lombok.Data;

@Data
public class SysMenu {

  private long menuId;
  private String menuName;
  private String menuPath;
  private long menuParentId;

}
