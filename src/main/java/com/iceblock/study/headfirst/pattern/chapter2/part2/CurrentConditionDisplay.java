package com.iceblock.study.headfirst.pattern.chapter2.part2;


import java.util.Observable;
import java.util.Observer;

/**
 * 显示当前温度，通过拉取的方式获取温度
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
    public void update(Observable o, Object args) {
        if (o instanceof WeatherData) {
            this.temperature = ((WeatherData) o).getTemperature();
            display();
        }
    }
}
