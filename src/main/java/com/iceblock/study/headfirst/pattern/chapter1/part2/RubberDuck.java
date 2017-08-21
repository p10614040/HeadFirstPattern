package com.iceblock.study.headfirst.pattern.chapter1.part2;

import com.iceblock.study.headfirst.pattern.chapter1.part2.behavior.FlyNoWay;
import com.iceblock.study.headfirst.pattern.chapter1.part2.behavior.Slience;

/**
 * 橡皮鸭
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/8/21
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Slience();
    }

    @Override
    void display() {
        System.out.println("我是橡皮鸭");
    }

}
