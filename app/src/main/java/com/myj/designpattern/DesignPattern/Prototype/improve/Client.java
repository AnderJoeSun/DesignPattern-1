package com.myj.designpattern.DesignPattern.Prototype.improve;


/**
 * Created by maoyujiao on 2019/8/25.
 *
 */

public class Client {
    public static void  main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("小白","1","白色");
        System.out.println(sheep);
        sheep.setName("小黑");
        Sheep sheep2 = (Sheep) sheep.clone();
        System.out.println(sheep2);
    }

}
