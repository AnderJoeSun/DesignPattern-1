package com.myj.designpattern.DesignPattern.Decorator;

/**
 * Created by maoyujiao on 2019/8/27.
 */

public class Chocolate extends MixDecorator {
    public Chocolate(Drink body) {
        super(body);//如果没有就会调用默认的空父类构造
        setDesc("巧克力");
        setPrice(2.0f);
    }
}
