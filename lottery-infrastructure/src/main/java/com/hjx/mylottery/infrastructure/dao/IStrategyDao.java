package com.hjx.mylottery.infrastructure.dao;

import com.hjx.mylottery.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IStrategyDao {

    Strategy queryStrategy(Long strategyId);
}
