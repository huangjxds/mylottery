package com.hjx.mylottery.domain.strategy.service.draw;

import com.hjx.mylottery.common.Constants;
import com.hjx.mylottery.domain.strategy.service.algorithm.IDrawAlgorithm;
import com.hjx.mylottery.domain.strategy.service.algorithm.impl.EntiretyRateRandomDrawAlgorithm;
import com.hjx.mylottery.domain.strategy.service.algorithm.impl.SingleRateRandomDrawAlgorithm;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DrawConfig {

    @Resource
    private IDrawAlgorithm entiretyRateRandomDrawAlgorithm;

    @Resource
    private IDrawAlgorithm singleRateRandomDrawAlgorithm;

    /** 抽奖策略组 */
    protected static Map<Integer, IDrawAlgorithm> drawAlgorithmGroup = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        drawAlgorithmGroup.put(Constants.StrategyMode.ENTIRETY.getCode(), entiretyRateRandomDrawAlgorithm);
        drawAlgorithmGroup.put(Constants.StrategyMode.SINGLE.getCode(), singleRateRandomDrawAlgorithm);
    }
}
