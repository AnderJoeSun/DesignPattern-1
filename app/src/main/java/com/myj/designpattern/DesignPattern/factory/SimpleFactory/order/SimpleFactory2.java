package com.myj.designpattern.DesignPattern.factory.SimpleFactory.order;

import com.myj.designpattern.DesignPattern.factory.SimpleFactory.pizzsa.CheesePizzsa;
import com.myj.designpattern.DesignPattern.factory.SimpleFactory.pizzsa.GreekPizzsa;
import com.myj.designpattern.DesignPattern.factory.SimpleFactory.pizzsa.Pizzsa;

/**
 * Created by maoyujiao on 2019/8/23.
 * 静态工厂
 */

public class SimpleFactory2 {
    public static Pizzsa createPizzsa(String type){
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
