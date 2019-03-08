package com.bigears.brandy.luck.lottery.service;

import com.bigears.brandy.luck.lottery.domain.valobj.DrawLotteryContext;

/**
 * LotteryService
 * @author shenyang
 * @date 2019/3/8
 */
public interface LotteryService {

    IssueResponse issueLottery(DrawLotteryContext drawLotteryContext);

}
