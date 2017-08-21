# 设计模式入门
欢迎来到设计模式世界。
## 先从简单的模拟鸭子应用做起
小杨在公司做了一套成功的鸭子游戏：SumUDuck。游戏中会出现各种鸭子，一边游泳一边呱呱叫。

* 鸭子超类（SuperClass）
```
abstract class Duck {
    quack(){
        // 呱呱叫
    }
    swim(){
        // 游泳
    }    
    /*每个鸭子外观不同，所以方法是抽象*/
    abstract display();
}
```
* 绿头鸭
```
class MallardDuck extends Duck {
    display() {
        // 外观是绿头
    }
}
```
* 红头鸭
```
class ReadHeadDuck extends Duck {
    display() {
        // 外观是红头
    }
}
```

现在我们得让鸭子能飞我们只需要在*Duck*类上加上*fly()*方法，然后所有鸭子都会继承并且会飞。
但是并非所有的鸭子都能飞，比如大黄鸭=。=！

这个时候小杨想到**继承**，大黄鸭可以覆盖*fly()*方法什么都不做。但是如果以后加入木头鸭子呢。