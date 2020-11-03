package com.example.demo.mapper;

import com.example.demo.pojo.AoyoGroupUser;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface AoyoGroupUderMapper {
     List<AoyoGroupUser> useralls();
}
