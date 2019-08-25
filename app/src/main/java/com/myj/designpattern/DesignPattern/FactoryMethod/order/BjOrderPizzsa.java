package com.myj.designpattern.DesignPattern.FactoryMethod.order;

import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.BjCheesePizzsa;
import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.BjGreekPizzsa;
import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.LonCheesePizzsa;
import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.Pizzsa;

/**
 * Created by maoyujiao on 2019/8/23.
 */

public class BjOrderPizzsa extends OrderPizzsa {
    @Override
    public Pizzsa createPizzssa(String type) {
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
