package com.iceblock.study.headfirst.pattern.chapter2.part1;

import java.util.Random;

/**
 * 显示预测温度
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/10/26
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private Float temperature;

    @Override
    public void display() {
        System.out.println("预计明天温度 ：" + (float) ((int) ((this.temperature + new Random().nextFloat() * 2 - 1) * 10)) / 10 + "℃");
    }

    @Override
    public void update(Float temperature) {
        this.temperature = temperature;
        display();
    }
}
