package com.bigears.brandy.luck.lottery.domain.aggregate;

import com.bigears.brandy.luck.lottery.domain.valobj.AwardPool;
import com.bigears.brandy.luck.lottery.domain.valobj.DrawLotteryContext;
import com.bigears.brandy.luck.lottery.domain.valobj.MtCityInfo;

import java.util.List;

/**
 * DrawLottery
 * @author shenyang
 * @date 2019/3/7
 */
public class DrawLottery {

    private int lotteryId;

    private List<AwardPool> awardPools;

    public int getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(int lotteryId) {
        this.lotteryId = lotteryId;
    }

    public List<AwardPool> getAwardPools() {
        return awardPools;
    }

    public void setAwardPools(List<AwardPool> awardPools) {
        this.awardPools = awardPools;
    }

    public AwardPool chooseAwardPool(DrawLotteryContext context) {
        if (context.getMtCityInfo() != null) {
            return chooseAwardPoolByCityInfo(awardPools,context.getMtCityInfo());
        }
        return chooseAwardPoolByScore(awardPools, context.getGameScore());
    }

    private AwardPool chooseAwardPoolByCityInfo(List<AwardPool> awardPools, MtCityInfo mtCityInfo) {
        for (AwardPool awardPool : awardPools) {
            if (awardPool.matchedCity(mtCityInfo.getCityId())) {
                return awardPool;
            }
        }
        return null;
    }

    private AwardPool chooseAwardPoolByScore(List<AwardPool> awardPools, int gameScore) {
        return awardPools.get(0);
    }
}
