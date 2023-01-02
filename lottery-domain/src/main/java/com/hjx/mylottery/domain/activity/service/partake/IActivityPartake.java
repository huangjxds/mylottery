package com.hjx.mylottery.domain.activity.service.partake;

import com.hjx.mylottery.domain.activity.model.req.PartakeReq;
import com.hjx.mylottery.domain.activity.model.res.PartakeResult;

public interface IActivityPartake {
    /**
     * 参与活动
     * @param req 入参
     * @return    领取结果
     */
    PartakeResult doPartake(PartakeReq req);
}
