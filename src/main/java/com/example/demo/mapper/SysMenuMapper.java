package com.example.demo.mapper;

import com.example.demo.pojo.SysMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysMenuMapper {

    public List<SysMenu> leftTree();

}
