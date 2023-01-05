package com.hjx.mylottery.application.process;

import com.hjx.mylottery.application.process.req.DrawProcessReq;
import com.hjx.mylottery.application.process.res.DrawProcessResult;

public interface IActivityProcess {
    /**
     * 执行抽奖流程
     * @param req 抽奖请求
     * @return    抽奖结果
     */
    DrawProcessResult doDrawProcess(DrawProcessReq req);
}
