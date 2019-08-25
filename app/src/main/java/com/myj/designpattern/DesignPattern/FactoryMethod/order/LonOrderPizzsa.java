package com.myj.designpattern.DesignPattern.FactoryMethod.order;

import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.BjGreekPizzsa;
import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.LonCheesePizzsa;
import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.LonGreekPizzsa;
import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.Pizzsa;

/**
 * Created by maoyujiao on 2019/8/23.
 */

public class LonOrderPizzsa extends OrderPizzsa {
    @Override
    public Pizzsa createPizzssa(String type) {
        Pizzsa pizzsa = null;
        if(type.equals("greek")){
            pizzsa = new LonGreekPizzsa();
            pizzsa.setName("伦敦希腊披萨");
        } else if(type .equals("cheese")){
            pizzsa = new LonCheesePizzsa();
            pizzsa.setName("伦敦奶酪披萨");
        }
        return pizzsa;
    }
}
