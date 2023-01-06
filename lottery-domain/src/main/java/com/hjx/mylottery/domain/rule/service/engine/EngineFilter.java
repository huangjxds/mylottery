package com.hjx.mylottery.domain.rule.service.engine;

import com.hjx.mylottery.domain.rule.model.req.DecisionMatterReq;
import com.hjx.mylottery.domain.rule.model.res.EngineResult;

public interface EngineFilter {
    /**
     * 规则过滤器接口
     *
     * @param matter      规则决策物料
     * @return            规则决策结果
     */
    EngineResult process(final DecisionMatterReq matter);
}
