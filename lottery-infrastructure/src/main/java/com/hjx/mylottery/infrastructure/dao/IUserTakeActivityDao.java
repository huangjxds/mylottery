package com.hjx.mylottery.infrastructure.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouter;
import com.hjx.mylottery.infrastructure.po.UserTakeActivity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserTakeActivityDao {
    /**
     * 插入用户领取活动信息
     *
     * @param userTakeActivity 入参
     */
    @DBRouter(key = "uId")
    void insert(UserTakeActivity userTakeActivity);
}
