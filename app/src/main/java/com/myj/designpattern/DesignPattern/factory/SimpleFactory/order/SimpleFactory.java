package com.myj.designpattern.DesignPattern.factory.SimpleFactory.order;

import com.myj.designpattern.DesignPattern.factory.SimpleFactory.pizzsa.CheesePizzsa;
import com.myj.designpattern.DesignPattern.factory.SimpleFactory.pizzsa.GreekPizzsa;
import com.myj.designpattern.DesignPattern.factory.SimpleFactory.pizzsa.Pizzsa;

/**
 * Created by maoyujiao on 2019/8/23.
 *
 * 基本介绍
 1) 简单工厂模式是属于创建型模式，是工厂模式的一种。
 简单工厂模式是由一 个工厂对象决定创建出哪一种产品类的实例。
 简单工厂模式是工厂模式家族 中最简单实用的模式
 2) 简单工厂模式:定义了一个创建对象的类，由这个类来封装实例化对象的行 为(代码)
 3) 在软件开发中，当我们会用到大量的创建某种、某类或者某批对象时，就会使用到工厂模式.
 */

public class SimpleFactory {
    public Pizzsa createPizzsa(String type){
        Pizzsa pizzsa = null;
        if(type.equals("greek")){
            pizzsa = new GreekPizzsa();
            pizzsa.setName("希腊披萨");
        } else if(type .equals("cheese")){
            pizzsa = new CheesePizzsa();
            pizzsa.setName("奶酪披萨");
        }
        return pizzsa;
    }
}
