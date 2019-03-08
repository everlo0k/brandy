package com.bigears.brandy.luck.lottery.domain.valobj;

/**
 * Award
 * @author shenyang
 * @date 2019/3/7
 */
public class Award {

    private String name;

    private int probability;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }
}
