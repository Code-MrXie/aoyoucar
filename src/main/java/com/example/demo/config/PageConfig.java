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
        registry.addViewController("/grouphome").setViewName("group/grouphome");
        registry.addViewController("/groupview").setViewName("group/groupview");
        registry.addViewController("/groupUpdate").setViewName("group/groupUpdate");
    }
}
