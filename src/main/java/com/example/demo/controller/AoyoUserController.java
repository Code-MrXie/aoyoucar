package com.example.demo.controller;

import com.example.demo.pojo.AoyoUser;
import com.example.demo.service.AoyoUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("login")
public class AoyoUserController {
    @Resource
    private  AoyoUserService aoyoUserService;
    @PostMapping("loginUser")
    public AoyoUser LoginUser(String username, String password, HttpSession session){
        AoyoUser user = aoyoUserService.LoginUser(username,password);
        if(user!=null){
            session.setAttribute("User",user );
        }

        return user;
    }

}
