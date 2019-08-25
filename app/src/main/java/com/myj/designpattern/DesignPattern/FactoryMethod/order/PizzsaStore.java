package com.myj.designpattern.DesignPattern.FactoryMethod.order;

import com.myj.designpattern.DesignPattern.factory.SimpleFactory.order.OrderPizzsa2;

/**
 * Created by maoyujiao on 2019/8/23.
 */

public class PizzsaStore {
    public static void main(String[] args){
        new BjOrderPizzsa(); //同时会调用父类的构造方法
//        new LonOrderPizzsa();
    }
}
