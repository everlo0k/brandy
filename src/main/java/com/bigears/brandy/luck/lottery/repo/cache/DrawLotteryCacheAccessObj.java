package com.bigears.brandy.luck.lottery.repo.cache;

import com.bigears.brandy.luck.lottery.domain.aggregate.DrawLottery;

import java.util.HashMap;

/**
 * DrawLotteryCacheAccessObj
 * @author shenyang
 * @date 2019/3/7
 */
public class DrawLotteryCacheAccessObj {

    private static HashMap<Integer, DrawLottery> map = new HashMap<>();

    public DrawLottery get(int lotteryId) {
        return map.get(lotteryId);
    }

    public void add(DrawLottery drawLottery){
        map.put(drawLottery.getLotteryId(), drawLottery);
    }
}
