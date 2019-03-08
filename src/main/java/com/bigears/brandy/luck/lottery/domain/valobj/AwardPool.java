package com.bigears.brandy.luck.lottery.domain.valobj;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * AwardPool
 * @author shenyang
 * @date 2019/3/7
 */
public class AwardPool {

    private String cityIds;

    private String scores;

    private int userGroupType;

    private List<Award> awards;

    /**
     * 当前奖池是否与城市匹配
     * @param cityId
     * @return
     */
    public boolean matchedCity(int cityId) {
        return false;
    }

    /**
     * 当前奖池是否与用户得分匹配
     * @param sorce
     * @return
     */
    public boolean matchedSorce(int sorce) {
        return false;
    }

    /**
     * 根据概率选择奖池
     * @return
     */
    public Award randomAndGet() {
        int sumOfProbablity = 0;
        for (Award award : awards) {
            sumOfProbablity += award.getProbability();
        }
        int randomNumber = ThreadLocalRandom.current().nextInt(sumOfProbablity);
        int range = 0;
        for (Award award : awards) {
            range += award.getProbability();
            if (randomNumber < range) {
                return award;
            }
        }
        return null;

    }


}
