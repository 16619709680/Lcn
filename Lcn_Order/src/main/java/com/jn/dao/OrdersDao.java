package com.jn.dao;

import com.jn.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersDao {
    int insert(Orders record);

    int insertSelective(Orders record);
}