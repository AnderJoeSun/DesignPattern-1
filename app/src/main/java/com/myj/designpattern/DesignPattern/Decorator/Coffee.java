package com.myj.designpattern.DesignPattern.Decorator;

/**
 * Created by maoyujiao on 2019/8/27.
 * 装饰者模式，可以在添加一个继承类
 */

public class Coffee extends Drink {

    @Override
    public float cost() {
        return getPrice();
    }
}
