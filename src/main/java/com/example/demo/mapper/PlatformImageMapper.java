package com.example.demo.mapper;

import com.example.demo.pojo.AoyoPlatformImage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlatformImageMapper {

    List<AoyoPlatformImage> queryplatformImages();

    int addPlatformImage(AoyoPlatformImage aoyoPlatformImage);

    int upDeleteplatformImage(int[] array);

    int maxSerialNumber(@Param("platformImageId") Integer platformImageId);
}
