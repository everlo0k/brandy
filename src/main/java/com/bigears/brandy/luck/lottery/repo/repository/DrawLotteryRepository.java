package com.bigears.brandy.luck.lottery.repo.repository;

import com.bigears.brandy.luck.lottery.domain.aggregate.DrawLottery;
import com.bigears.brandy.luck.lottery.repo.cache.DrawLotteryCacheAccessObj;
import com.bigears.brandy.luck.lottery.repo.dao.AwardDao;
import com.bigears.brandy.luck.lottery.repo.dao.AwardPoolDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * DrawLotteryRepository
 * @author shenyang
 * @date 2019/3/7
 */
@Repository
public class DrawLotteryRepository {

    @Autowired
    private AwardDao awardDao;

    @Autowired
    private AwardPoolDao awardPoolDao;

    @Autowired
    private DrawLotteryCacheAccessObj drawLotteryCacheAccessObj;

    public DrawLottery getDrawLotteryById(int lotteryId) {
        DrawLottery drawLottery = drawLotteryCacheAccessObj.get(lotteryId);
        if (drawLottery == null) {
            drawLottery = getDrawLotteryFromDB(lotteryId);
            drawLotteryCacheAccessObj.add(drawLottery);
        }
        return drawLottery;
    }

    /**
     * 通过lotteryId在数据库查询
     * @param lotteryId
     * @return
     */
    private DrawLottery getDrawLotteryFromDB(int lotteryId) {
        return new DrawLottery();
    }
}
