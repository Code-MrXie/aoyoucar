package com.example.demo.controller;

import com.example.demo.pojo.AoyoCommodityComment;
import com.example.demo.pojo.AoyoCommodityNorms;
import com.example.demo.pojo.AoyoGroupComment;
import com.example.demo.pojo.LayuiEntity;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("Commentall")
    public LayuiEntity CommodityComments(){
        LayuiEntity layuiEntity=new LayuiEntity();
        List<AoyoCommodityComment> commentall = commentService.commentall();
       /* System.out.println(commentall.size());*/
        layuiEntity.setData(commentall);
        layuiEntity.setCount(commentall.size());
        layuiEntity.setMsg("成功");
        layuiEntity.setCode(0);
        return  layuiEntity;

    }
}
