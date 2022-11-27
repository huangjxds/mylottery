package com.hjx.mylottery.domain.strategy.service.draw;

import com.hjx.mylottery.domain.strategy.model.req.DrawReq;
import com.hjx.mylottery.domain.strategy.model.res.DrawResult;

public interface IDrawExec {

    DrawResult doDrawExec(DrawReq req);
}
