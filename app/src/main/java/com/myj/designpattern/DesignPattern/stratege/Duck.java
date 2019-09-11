package com.myj.designpattern.DesignPattern.stratege;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class Duck {
    public String name;

    public Duck(String name) {
        this.name = name;
    }

    public void fly(){
        System.out.println(name + "会飞");
    }

    public void swim(){
        System.out.println(name + "会游泳");
    }

    public void quack(){
        System.out.println(name + "会嘎嘎");
    }

}
