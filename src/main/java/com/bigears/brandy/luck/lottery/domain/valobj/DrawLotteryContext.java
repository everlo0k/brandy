package com.bigears.brandy.luck.lottery.domain.valobj;

/**
 * DrawLotteryContext
 * @author shenyang
 * @date 2019/3/7
 */
public class DrawLotteryContext {

    private MtCityInfo mtCityInfo;

    public int getGameScore() {
        return gameScore;
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }

    private int gameScore;

    public MtCityInfo getMtCityInfo() {
        return mtCityInfo;
    }

    public void setMtCityInfo(MtCityInfo mtCityInfo) {
        this.mtCityInfo = mtCityInfo;
    }
}
