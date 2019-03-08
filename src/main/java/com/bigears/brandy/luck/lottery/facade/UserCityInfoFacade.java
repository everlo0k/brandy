package com.bigears.brandy.luck.lottery.facade;

import com.bigears.brandy.luck.lottery.domain.valobj.DrawLotteryContext;
import com.bigears.brandy.luck.lottery.domain.valobj.MtCityInfo;

/**
 * UserCityInfoFacade
 * @author shenyang
 * @date 2019/3/7
 */
public class UserCityInfoFacade {

    // 外部用户城市信息rpc服务
    // private LbsService lbsService;

    public MtCityInfo getMtCityInfo(DrawLotteryContext drawLotteryContext) {
        // 通过外部rpc服务得到MtCityInfo
        return new MtCityInfo();
    }

}
