package com.iceblock.study.headfirst.pattern.chapter1.part2.behavior;

/**
 * 静音，不会叫
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/8/21
 */
public class Slience implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Slience>>");
    }
}
