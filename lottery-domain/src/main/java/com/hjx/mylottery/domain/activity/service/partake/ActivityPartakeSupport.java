package com.hjx.mylottery.domain.activity.service.partake;

import com.hjx.mylottery.domain.activity.model.req.PartakeReq;
import com.hjx.mylottery.domain.activity.model.vo.ActivityBillVO;
import com.hjx.mylottery.domain.activity.repository.IActivityRepository;

import javax.annotation.Resource;

public class ActivityPartakeSupport {
    @Resource
    protected IActivityRepository activityRepository;

    protected ActivityBillVO queryActivityBill(PartakeReq req){
        return activityRepository.queryActivityBill(req);
    }

}
