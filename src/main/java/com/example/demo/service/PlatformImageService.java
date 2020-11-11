package com.example.demo.service;

import com.example.demo.pojo.AoyoPlatformImage;
import com.github.pagehelper.PageInfo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface PlatformImageService {
    PageInfo<AoyoPlatformImage> queryplatformImages(AoyoPlatformImage  aoyoPlatformImage);

    int addPlatformImage(AoyoPlatformImage aoyoPlatformImage, MultipartFile platformFile) throws IOException;

    int upDeleteplatformImage(int[] array);
}
