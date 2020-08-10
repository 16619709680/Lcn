package com.jn.dao;

import com.jn.entity.Pay;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PayDao {
    int insert(Pay record);

    int insertSelective(Pay record);
}