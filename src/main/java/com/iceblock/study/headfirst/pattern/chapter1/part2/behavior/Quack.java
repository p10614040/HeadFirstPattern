package com.iceblock.study.headfirst.pattern.chapter1.part2.behavior;

/**
 * 呱呱叫
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/8/21
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
