package com.myj.designpattern.DesignPattern.factory.SimpleFactory.order;

/**
 * Created by maoyujiao on 2019/8/23.
 */

public class PizzsaStore {
    public static void main(String[] args){
//        new OrderPizzsa();

        //使用简单工厂
//        new OrderPizzsa(new SimpleFactory()); //后期工厂还可以改变

        //静态工厂方式
        new OrderPizzsa2();
    }
}
