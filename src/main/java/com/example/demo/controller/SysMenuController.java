package com.example.demo.controller;

import com.example.demo.service.SysMenuService;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;

    @RequestMapping("showLeftTrees")
    public Result showLeftTrees() {
        return new Result(0, "ok", sysMenuService.initLeftTree());
    }

}
