package com.hjx.mylottery.infrastructure.dao;

import com.hjx.mylottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IAwardDao {
    Award queryAwardInfo(String awardId);
}
