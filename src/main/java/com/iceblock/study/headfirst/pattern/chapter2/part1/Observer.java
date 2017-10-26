package com.iceblock.study.headfirst.pattern.chapter2.part1;

/**
 * 观察者
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/10/26
 */
public interface Observer {

    /**
     * 接收主题的通知
     */
    void update(Float temperature);
}
