package com.hjx.mylottery.domain.award.service.goods.impl;

import com.hjx.mylottery.common.Constants;
import com.hjx.mylottery.domain.award.model.req.GoodsReq;
import com.hjx.mylottery.domain.award.model.res.DistributionRes;
import com.hjx.mylottery.domain.award.service.goods.DistributionBase;
import com.hjx.mylottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;

@Component
public class DescGoods extends DistributionBase implements IDistributionGoods {
    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

    @Override
    public Integer getDistributionGoodsName() {
        return Constants.AwardType.DESC.getCode();
    }

}
