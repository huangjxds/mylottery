package com.hjx.mylottery.interfaces;

import com.hjx.mylottery.common.Constants;
import com.hjx.mylottery.common.Result;
import com.hjx.mylottery.infrastructure.dao.IActivityDao;
import com.hjx.mylottery.infrastructure.po.Activity;
import com.hjx.mylottery.rpc.IActivityBooth;
import com.hjx.mylottery.rpc.dto.ActivityDto;
import com.hjx.mylottery.rpc.req.ActivityReq;
import com.hjx.mylottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;
import javax.annotation.Resource;

@Service
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {

        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }

}
