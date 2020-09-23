package com.qfedu.entity;

/**
 * @ProjectName:echarsTest
 * @author:卢卫振
 * @date:2020/9/23 20:03
 * Description:
 */
public class ScoreResult {
    public int value;
    private String name;

    public ScoreResult() {
    }

    public ScoreResult(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
