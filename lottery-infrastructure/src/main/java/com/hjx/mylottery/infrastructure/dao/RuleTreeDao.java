package com.hjx.mylottery.infrastructure.dao;

import com.hjx.mylottery.infrastructure.po.RuleTree;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RuleTreeDao {
    /**
     * 规则树查询
     * @param id ID
     * @return   规则树
     */
    RuleTree queryRuleTreeByTreeId(Long id);

    /**
     * 规则树简要信息查询
     * @param treeId 规则树ID
     * @return       规则树
     */
    RuleTree queryTreeSummaryInfo(Long treeId);
}
