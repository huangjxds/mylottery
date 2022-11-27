package com.hjx.mylottery.domain.strategy.repository.impl;

import com.hjx.mylottery.domain.strategy.model.aggregates.StrategyRich;
import com.hjx.mylottery.domain.strategy.repository.IStrategyRepository;
import com.hjx.mylottery.infrastructure.dao.IAwardDao;
import com.hjx.mylottery.infrastructure.dao.IStrategyDao;
import com.hjx.mylottery.infrastructure.dao.IStrategyDetailDao;
import com.hjx.mylottery.infrastructure.po.Award;
import com.hjx.mylottery.infrastructure.po.Strategy;
import com.hjx.mylottery.infrastructure.po.StrategyDetail;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class StrategyRepository implements IStrategyRepository {

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource
    private IAwardDao awardDao;

    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.queryStrategy(strategyId);
        List<StrategyDetail> strategyDetailList = strategyDetailDao.queryStrategyDetailList(strategyId);
        return new StrategyRich(strategyId, strategy, strategyDetailList);
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return awardDao.queryAwardInfo(awardId);
    }
}
