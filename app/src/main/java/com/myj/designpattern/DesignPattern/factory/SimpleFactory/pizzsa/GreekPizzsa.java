package com.myj.designpattern.DesignPattern.factory.SimpleFactory.pizzsa;

/**
 * Created by maoyujiao on 2019/8/23.
 */

public class GreekPizzsa extends Pizzsa {
    @Override
    public void prepare() {
        System.out.println("制作希腊披萨");
    }
}
