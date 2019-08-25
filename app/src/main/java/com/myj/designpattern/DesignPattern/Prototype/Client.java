package com.myj.designpattern.DesignPattern.Prototype;

/**
 * Created by maoyujiao on 2019/8/25.
 *
 * 1) 优点是比较好理解，简单易操作。
 2) 在创建新的对象时，总是需要重新获取原始对象的属性，如果创建的对象比较复杂 时，效率较低
 3) 总是需要重新初始化对象，而不是动态地获得对象运行时的状态, 不够灵活 4) 改进的思路分析
 思路:Java中Object类是所有类的根类，Object类提供了一个clone()方法，
 该方法可以 将一个Java对象复制一份，但是需要实现clone的Java类
 必须要实现一个接口Cloneable，
 该接口表示该类能够复制且具有复制的能力 => 原型模式
 */

public class Client {
    public static void  main(String[] args){
        Sheep sheep = new Sheep("小白","1","白色");
        Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        System.out.println(sheep.toString());
        System.out.println(sheep2.toString());
    }

}
