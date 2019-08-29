package com.myj.designpattern.DesignPattern.Flyweight;

/**
 * Created by maoyujiao on 2019/8/29.
 */

public class Client {
    public static void main(String[] args){
        FlyweightFactory factory = new FlyweightFactory();
        FlyWeight flyWeight1 = factory.getFlyweight("网站");
        flyWeight1.run(new User("小强"));

        FlyWeight flyWeight2 = factory.getFlyweight("博客");
        flyWeight2.run(new User("小毛"));

        FlyWeight flyWeight3 = factory.getFlyweight("博客");
        flyWeight3.run(new User("小陈"));

        System.out.println("总共有多少个对象:"+ factory.getCount());
    }
}
