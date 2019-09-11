package com.myj.designpattern.DesignPattern.stratege;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class CanSwimBehavior implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("会游泳");
    }
}
