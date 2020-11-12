package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PageConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/loging").setViewName("loging");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/pagehome").setViewName("pagehome");
        registry.addViewController("/commodityImg").setViewName("commodityImg");
        registry.addViewController("/coupon").setViewName("coupon");
        registry.addViewController("/commodity").setViewName("commodity");
        registry.addViewController("/grouphome").setViewName("group/grouphome");
        registry.addViewController("/groupview").setViewName("group/groupview");
        registry.addViewController("/groupUpdate").setViewName("group/groupUpdate");
        registry.addViewController("/commodityHome").setViewName("group/commodity/commodityHome");
        registry.addViewController("/commodityUpdate").setViewName("group/commodity/commodityUpdate");
        registry.addViewController("/commodityview").setViewName("group/commodity/commodityview");
        registry.addViewController("/platformImage").setViewName("platformImage");
        registry.addViewController("/orderlist").setViewName("orderlist");
        registry.addViewController("/content-edit").setViewName("content-edit");
        registry.addViewController("/classify").setViewName("classify");
        registry.addViewController("/cartype").setViewName("cartype");
    }
}
