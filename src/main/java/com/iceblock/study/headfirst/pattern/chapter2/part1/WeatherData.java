package com.iceblock.study.headfirst.pattern.chapter2.part1;

import java.util.ArrayList;

/**
 * 天气应用，获取天气并通知天气告示板展示
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/10/26
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private Float temperature;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }


    /**
     * 天气温度变化
     */
    private void measurementsChanged() {
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
