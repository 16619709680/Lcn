package com.jn.dao;

import com.jn.entity.Order;

public interface OrderDao {
    int insert(Order record);

    int insertSelective(Order record);
}