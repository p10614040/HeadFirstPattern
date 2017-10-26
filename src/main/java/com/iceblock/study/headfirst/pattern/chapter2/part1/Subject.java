package com.iceblock.study.headfirst.pattern.chapter2.part1;

/**
 * 主题
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/10/26
 */
public interface Subject {

    /**
     * 注册观察者
     */
    void registerObserver(Observer o);

    /**
     * 取消注册
     */
    void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
