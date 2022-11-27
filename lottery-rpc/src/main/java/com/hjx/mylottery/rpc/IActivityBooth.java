package com.hjx.mylottery.rpc;

import com.hjx.mylottery.rpc.req.ActivityReq;
import com.hjx.mylottery.rpc.res.ActivityRes;

public interface IActivityBooth {

    ActivityRes queryActivityById(ActivityReq req);
}
