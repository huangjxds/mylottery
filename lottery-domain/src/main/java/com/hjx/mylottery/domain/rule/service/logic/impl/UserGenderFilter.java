package com.hjx.mylottery.domain.rule.service.logic.impl;

import com.hjx.mylottery.domain.rule.model.req.DecisionMatterReq;
import com.hjx.mylottery.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

@Component
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("gender").toString();
    }
}
