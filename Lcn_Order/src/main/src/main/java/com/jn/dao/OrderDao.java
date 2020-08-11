package com.jn.dao;

public interface OrderDao {
    int insert(Order record);

    int insertSelective(Order record);
}