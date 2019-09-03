package com.myj.designpattern.DesignPattern.observer;

/**
 * Created by maoyujiao on 2019/9/3.
 */

public class CurrentWeather implements Observer {
    @Override
    public void update() {
        System.out.println("当前气温变化了");
    }
}
