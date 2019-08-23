package com.myj.designpattern.DesignPattern.AbstractFactory.order;

/**
 * Created by maoyujiao on 2019/8/23.
 */

public class PizzsaStore {
    public static void main(String[] args){
//        new OrderPizzsa(new BjFactory());
        new OrderPizzsa(new LonFactory());
    }
}
