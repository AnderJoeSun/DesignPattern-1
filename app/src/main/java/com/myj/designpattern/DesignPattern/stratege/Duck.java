package com.myj.designpattern.DesignPattern.stratege;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class Duck {
    public String name;

    //属性：策略接口1
    public SwimBehavior swimBehavior;

    public Duck(String name) {
        this.name = name;
    }

    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    public void fly(){
        System.out.println(name + "会飞");
    }


    public void quack(){
        System.out.println(name + "会嘎嘎");
    }

    public void swim(){
        if(swimBehavior != null){
            swimBehavior.swim();
        }
    }

}
