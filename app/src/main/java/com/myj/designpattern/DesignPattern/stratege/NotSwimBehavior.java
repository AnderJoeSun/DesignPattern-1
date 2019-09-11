package com.myj.designpattern.DesignPattern.stratege;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class NotSwimBehavior implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("不会游泳");
    }
}
