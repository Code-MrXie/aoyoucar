package com.example.demo.pojo;

import lombok.Data;

@Data
public class LayuiEntity<T> {
    private Integer code;
    private String msg;
    private Integer count;
    private T data;

}
