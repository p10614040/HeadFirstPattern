package com.iceblock.study.headfirst.pattern.chapter2.part1;

/**
 * 气象站
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/10/26
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new CurrentConditionDisplay());
        weatherData.registerObserver(new StatisticsDisplay());

        weatherData.setTemperature(20.1F);
        weatherData.setTemperature(22.3F);
        weatherData.setTemperature(19.7F);
    }
}
