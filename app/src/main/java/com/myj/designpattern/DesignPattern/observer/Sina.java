package com.myj.designpattern.DesignPattern.observer;

/**
 * Created by maoyujiao on 2019/9/3.
 */

public class Sina implements Observer {
    @Override
    public void update() {
        System.out.println("新浪网当前气温变化了");
    }
}
