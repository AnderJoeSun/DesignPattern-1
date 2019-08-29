package com.myj.designpattern.DesignPattern.Flyweight;

/**
 * Created by maoyujiao on 2019/8/29.
 */

public class Client {
    public static void main(String[] args){
        FlyweightFactory factory = new FlyweightFactory();
        FlyWeight flyWeight = factory.getFlyweight("网站");
        flyWeight.run();
    }
}
