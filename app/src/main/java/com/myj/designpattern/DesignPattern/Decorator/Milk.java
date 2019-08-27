package com.myj.designpattern.DesignPattern.Decorator;

/**
 * Created by maoyujiao on 2019/8/27.
 *
 * 说明
 1) Milk包含了LongBlack
 2) 一份Chocolate包含了(Milk+LongBlack)
 3) 一份Chocolate包含了(Chocolate+Milk+LongBlack)
 4) 这样不管是什么形式的单品咖啡+调料组合，通过递归方式可以方便的组合和维护。
 */

public class Milk extends MixDecorator {

    public Milk(Drink body) {
        super(body);
        setDesc("牛奶");
        setPrice(1.0f);
    }
}
