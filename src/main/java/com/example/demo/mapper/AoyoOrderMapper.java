package com.example.demo.mapper;

import com.example.demo.pojo.AoyoOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AoyoOrderMapper {
    List<AoyoOrder> queryAll( );

    List<AoyoOrder> queryByOrderCode(String orderCode);

    int delByCode(String orderCode);
}
