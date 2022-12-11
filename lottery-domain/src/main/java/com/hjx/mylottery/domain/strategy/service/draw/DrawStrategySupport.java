package com.hjx.mylottery.domain.strategy.service.draw;

import com.hjx.mylottery.domain.strategy.model.aggregates.StrategyRich;
import com.hjx.mylottery.domain.strategy.repository.IStrategyRepository;
import com.hjx.mylottery.infrastructure.po.Award;

import javax.annotation.Resource;

public class DrawStrategySupport extends DrawConfig {
    @Resource
    protected IStrategyRepository strategyRepository;

    /**
     * 查询策略配置信息
     *
     * @param strategyId 策略ID
     * @return 策略配置信息
     */
    protected StrategyRich queryStrategyRich(Long strategyId){
        return strategyRepository.queryStrategyRich(strategyId);
    }

    /**
     * 查询奖品详情信息
     *
     * @param awardId 奖品ID
     * @return 中奖详情
     */
    protected Award queryAwardInfoByAwardId(String awardId){
        return strategyRepository.queryAwardInfo(awardId);
    }

}
