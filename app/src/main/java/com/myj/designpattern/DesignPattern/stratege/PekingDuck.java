package com.myj.designpattern.DesignPattern.stratege;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class PekingDuck extends Duck {
    public PekingDuck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + "不会游");
    }
}
