package com.tsubasa.WarehouseSystem.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsubasa.WarehouseSystem.entity.Order;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao extends BaseMapper<Order> {

}