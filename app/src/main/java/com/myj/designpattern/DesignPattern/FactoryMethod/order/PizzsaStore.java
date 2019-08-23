package com.myj.designpattern.DesignPattern.FactoryMethod.order;

/**
 * Created by maoyujiao on 2019/8/23.
 */

public class PizzsaStore {
    public static void main(String[] args){
        new OrderPizzsa(new BjFactory());
    }
}
