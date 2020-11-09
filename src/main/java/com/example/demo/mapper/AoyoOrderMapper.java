package com.example.demo.mapper;

import com.example.demo.pojo.AoyoOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AoyoOrderMapper {
    List<AoyoOrder> queryAll( );

    List<AoyoOrder> queryByOrderCode(String orderCode);

    int delByCode(String orderCode);

    int changeOne( @Param("orderCode") String orderCode,@Param("orderStatus") Integer orderStatus,@Param("payChannel") Integer payChannel);
}
