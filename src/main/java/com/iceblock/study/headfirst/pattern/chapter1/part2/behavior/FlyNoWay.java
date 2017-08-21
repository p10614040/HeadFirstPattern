package com.iceblock.study.headfirst.pattern.chapter1.part2.behavior;

/**
 * 不会飞的鸭子
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/8/21
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
