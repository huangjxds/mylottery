package com.hjx.mylottery.domain.rule.repository;

import com.hjx.mylottery.domain.rule.model.aggregates.TreeRuleRich;

public interface IRuleRepository {
    /**
     * 查询规则决策树配置
     *
     * @param treeId    决策树ID
     * @return          决策树配置
     */
    TreeRuleRich queryTreeRuleRich(Long treeId);
}
