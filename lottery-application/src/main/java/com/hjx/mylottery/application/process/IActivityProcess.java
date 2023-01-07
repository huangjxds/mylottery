package com.hjx.mylottery.application.process;

import com.hjx.mylottery.application.process.req.DrawProcessReq;
import com.hjx.mylottery.application.process.res.DrawProcessResult;
import com.hjx.mylottery.application.process.res.RuleQuantificationCrowdResult;
import com.hjx.mylottery.domain.rule.model.req.DecisionMatterReq;

public interface IActivityProcess {
    /**
     * 执行抽奖流程
     * @param req 抽奖请求
     * @return    抽奖结果
     */
    DrawProcessResult doDrawProcess(DrawProcessReq req);

    /**
     * 规则量化人群，返回可参与的活动ID
     * @param req   规则请求
     * @return      量化结果，用户可以参与的活动ID
     */
    RuleQuantificationCrowdResult doRuleQuantificationCrowd(DecisionMatterReq req);


}
