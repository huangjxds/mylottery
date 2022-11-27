package com.hjx.mylottery.domain.strategy.repository;

import com.hjx.mylottery.domain.strategy.model.aggregates.StrategyRich;
import com.hjx.mylottery.infrastructure.po.Award;

public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);
}
