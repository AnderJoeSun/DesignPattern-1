package com.myj.designpattern.DesignPattern.AbstractFactory.order;

import com.myj.designpattern.DesignPattern.AbstractFactory.pizzsa.BjCheesePizzsa;
import com.myj.designpattern.DesignPattern.AbstractFactory.pizzsa.BjGreekPizzsa;
import com.myj.designpattern.DesignPattern.AbstractFactory.pizzsa.Pizzsa;

/**
 * Created by maoyujiao on 2019/8/23.
 */

public class BjFactory implements AbstractFactory {


    @Override
    public Pizzsa createPizzsa(String type) {
        Pizzsa pizzsa = null;
        if(type.equals("greek")){
            pizzsa = new BjGreekPizzsa();
            pizzsa.setName("北京希腊披萨");
        } else if(type .equals("cheese")){
            pizzsa = new BjCheesePizzsa();
            pizzsa.setName("北京奶酪披萨");
        }
        return pizzsa;
    }
}
