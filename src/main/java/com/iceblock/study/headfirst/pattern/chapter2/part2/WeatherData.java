package com.iceblock.study.headfirst.pattern.chapter2.part2;

import java.util.Observable;

/**
 * 通过 ObserverAble 实现的观察者模式
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/10/26
 */
public class WeatherData extends Observable {

    private Float temperature;

    /**
     * 天气温度变化
     */
    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }


    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
        measurementsChanged();
    }
}
