package com.iceblock.study.headfirst.pattern.chapter1.part1;

/**
 * 橡皮鸭
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/8/21
 */
public class RubberDuck extends Duck {

    @Override
    void display() {
        System.out.println("我是橡皮鸭");
    }

    @Override
    void fly() {
        // do nothing
    }
}
