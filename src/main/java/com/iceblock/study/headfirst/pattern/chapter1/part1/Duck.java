package com.iceblock.study.headfirst.pattern.chapter1.part1;

/**
 * 鸭子超类
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/8/21
 */
public abstract class Duck {

    void quack() {
        System.out.println("呱呱叫");
    }

    void swim() {
        System.out.println("游泳");
    }

    abstract void display();

    void fly() {
        System.out.println("飞");
    }
}
