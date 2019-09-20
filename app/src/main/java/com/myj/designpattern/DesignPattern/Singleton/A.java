package com.myj.designpattern.DesignPattern.Singleton;

/**
 * Created by maoyujiao on 2019/9/20.
 * 在JDK1.5 之前，我们定义常量都是： public static fianl.... 。现在好了，有了枚举，可以把相关的常量分组到一个枚举类型里，而且枚举提供了比常量更多的方法。
 * 如果打算自定义自己的方法，那么必须在enum实例序列的最后添加一个分号。而且 Java 要求必须先定义 enum 实例。
 */

enum Signal {
    GREEN, YELLOW, RED
}

public class A {

    public static void main(String[] args){
        Signal color = Signal.RED;
            switch (color) {
                case RED:
                    color = Signal.GREEN;
                    break;
                case YELLOW:
                    color = Signal.RED;
                    break;
                case GREEN:
                    color = Signal.YELLOW;
                    break;
        }
        System.out.println(color);
    }

}
