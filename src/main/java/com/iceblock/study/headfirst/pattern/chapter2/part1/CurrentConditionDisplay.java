package com.iceblock.study.headfirst.pattern.chapter2.part1;

/**
 * 显示当前温度
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/10/26
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Float temperature;

    @Override
    public void display() {
        System.out.println("当前温度 ：" + this.temperature + "℃");
    }

    @Override
    public void update(Float temperature) {
        this.temperature = temperature;
        display();
    }
}
