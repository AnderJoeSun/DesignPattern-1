package com.myj.designpattern.DesignPattern.stratege;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class ToyDuck extends Duck {
    public ToyDuck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + "不会飞");
    }

    @Override
    public void swim() {
        System.out.println(name + "不会游");
    }

    @Override
    public void quack() {
        System.out.println(name + "不会叫");
    }
}
