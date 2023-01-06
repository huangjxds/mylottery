package com.hjx.mylottery.rpc.res;

import com.hjx.mylottery.common.Result;
import com.hjx.mylottery.rpc.dto.AwardDTO;

import java.io.Serializable;

public class DrawRes extends Result implements Serializable {
    private AwardDTO awardDTO;

    public DrawRes(String code, String info) {
        super(code, info);
    }

    public AwardDTO getAwardDTO() {
        return awardDTO;
    }

    public void setAwardDTO(AwardDTO awardDTO) {
        this.awardDTO = awardDTO;
    }
}
