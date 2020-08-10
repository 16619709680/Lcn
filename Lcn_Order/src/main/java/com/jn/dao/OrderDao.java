package com.jn.dao;

import com.jn.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface OrderDao {
    int insert(Order record);

    int insertSelective(Order record);
}