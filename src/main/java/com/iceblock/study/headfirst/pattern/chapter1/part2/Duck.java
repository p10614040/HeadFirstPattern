package com.iceblock.study.headfirst.pattern.chapter1.part2;

import com.iceblock.study.headfirst.pattern.chapter1.part2.behavior.FlyBehavior;
import com.iceblock.study.headfirst.pattern.chapter1.part2.behavior.QuackBehavior;

/**
 * 鸭子超类
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/8/21
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void performQuack() {
        quackBehavior.quack();
    }

    void swim() {
        System.out.println("游泳");
    }

    abstract void display();

    void performFly() {
        flyBehavior.fly();
    }
}
