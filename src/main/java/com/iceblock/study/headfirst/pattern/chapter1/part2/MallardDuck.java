package com.iceblock.study.headfirst.pattern.chapter1.part2;

import com.iceblock.study.headfirst.pattern.chapter1.part2.behavior.FlyWithWings;
import com.iceblock.study.headfirst.pattern.chapter1.part2.behavior.Quack;

/**
 * 绿头鸭
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/8/21
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("我是绿色");
    }

}
