package com.myj.designpattern.DesignPattern.stratege;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class Client {
    public static void main(String[] args){
        PekingDuck pekingDuck = new PekingDuck("北京鸭");
        pekingDuck.setSwimBehavior(new CanSwimBehavior());
        ToyDuck toyDuck = new ToyDuck("玩具鸭");
        toyDuck.setSwimBehavior(new NotSwimBehavior());
        pekingDuck.swim();
        toyDuck.swim();

    }
}
