package com.hjx.mylottery.domain.activity.model.res;

import com.hjx.mylottery.common.Result;

public class PartakeResult extends Result {
    /**
     * 策略ID
     */
    private Long strategyId;

    public PartakeResult(String code, String info) {
        super(code, info);
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }
}
