package com.example.demo.service.impl;

import com.example.demo.mapper.SysMenuMapper;
import com.example.demo.pojo.LeftTree;
import com.example.demo.pojo.SysMenu;
import com.example.demo.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SysMenuServiceImpl implements SysMenuService {

    private List<SysMenu> sysMenuList;
    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public List<LeftTree> initLeftTree() {
        sysMenuList = sysMenuMapper.leftTree();
        return gentorLeftTree(-1L);
    }

    private List<LeftTree> gentorLeftTree(Long id) {
        List<LeftTree> leftTrees = new ArrayList<>();
        for (SysMenu sysMenu : sysMenuList) {
            if (sysMenu.getMenuParentId() != id) continue;
            LeftTree leftTree = new LeftTree();
            leftTree.setId(sysMenu.getMenuId());
            leftTree.setTitle(sysMenu.getMenuName());
            leftTree.setHref(sysMenu.getMenuPath());
            leftTree.setEnable(false);
            leftTree.setParentId(sysMenu.getMenuParentId());
            leftTree.setChildren(gentorLeftTree(sysMenu.getMenuId()));
            leftTrees.add(leftTree);
        }
        return leftTrees;
    }
}
