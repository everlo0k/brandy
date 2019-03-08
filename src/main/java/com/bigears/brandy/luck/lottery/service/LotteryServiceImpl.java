package com.bigears.brandy.luck.lottery.service;

import com.bigears.brandy.luck.lottery.domain.valobj.DrawLotteryContext;
import com.bigears.brandy.luck.lottery.facade.UserCityInfoFacade;
import com.bigears.brandy.luck.lottery.repo.repository.DrawLotteryRepository;

/**
 * LotteryServiceImpl
 * @author shenyang
 * @date 2019/3/8
 */
public class LotteryServiceImpl implements LotteryService {

    private DrawLotteryRepository drawLotteryRepository;

    private UserCityInfoFacade userCityInfoFacade;

    // private AwardSendService awardSendService;

    // private AwardCounterFacade awardCounterFacade;

    @Override
    public IssueResponse issueLottery(DrawLotteryContext drawLotteryContext) {
        // 1.获取抽奖配置聚合根
        // 2.增加抽奖计数
        // 3.选中奖池
        // 4.选中奖品
        // 5.发出奖品实体
        return new IssueResponse();
    }
}
