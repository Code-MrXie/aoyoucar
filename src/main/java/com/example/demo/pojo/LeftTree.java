package com.example.demo.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class LeftTree {

    private Long id;
    private Long parentId;
    private String code;
    private String title;
    private boolean enable;
    private String href;
    private List<LeftTree> children;
}
