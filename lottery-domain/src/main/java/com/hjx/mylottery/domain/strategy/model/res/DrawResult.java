package com.hjx.mylottery.domain.strategy.model.res;

import com.hjx.mylottery.common.Constants;
import com.hjx.mylottery.domain.strategy.model.vo.DrawAwardVO;

public class DrawResult {
    // 用户ID
    private String uId;

    // 策略ID
    private Long strategyId;

    // 奖品ID
    private String rewardId;

    // 奖品名称
    private String awardName;

    /**
     * 中奖状态：0未中奖、1已中奖、2兜底奖 Constants.DrawState
     */
    private Integer drawState = Constants.DrawState.FAIL.getCode();

    /**
     * 中奖奖品信息
     */
    private DrawAwardVO drawAwardVO;

    public DrawResult() {
    }

    public DrawResult(String uId, Long strategyId, Integer drawState) {
        this.uId = uId;
        this.strategyId = strategyId;
        this.drawState = drawState;
    }

    public DrawResult(String uId, Long strategyId, Integer drawState, DrawAwardVO drawAwardVO) {
        this.uId = uId;
        this.strategyId = strategyId;
        this.drawState = drawState;
        this.drawAwardVO = drawAwardVO;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public String getRewardId() {
        return rewardId;
    }

    public void setRewardId(String rewardId) {
        this.rewardId = rewardId;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public Integer getDrawState() {
        return drawState;
    }

    public void setDrawState(Integer drawState) {
        this.drawState = drawState;
    }

    public DrawAwardVO getDrawAwardInfo() {
        return drawAwardVO;
    }

    public void setDrawAwardInfo(DrawAwardVO drawAwardVO) {
        this.drawAwardVO = drawAwardVO;
    }
}
