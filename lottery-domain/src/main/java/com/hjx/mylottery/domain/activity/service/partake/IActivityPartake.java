package com.hjx.mylottery.domain.activity.service.partake;

import com.hjx.mylottery.common.Result;
import com.hjx.mylottery.domain.activity.model.req.PartakeReq;
import com.hjx.mylottery.domain.activity.model.res.PartakeResult;
import com.hjx.mylottery.domain.activity.model.vo.DrawOrderVO;

public interface IActivityPartake {
    /**
     * 参与活动
     * @param req 入参
     * @return    领取结果
     */
    PartakeResult doPartake(PartakeReq req);

    /**
     * 保存奖品单
     * @param drawOrder 奖品单
     * @return          保存结果
     */
    Result recordDrawOrder(DrawOrderVO drawOrder);
}
