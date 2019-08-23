package com.myj.designpattern.DesignPattern.AbstractFactory.order;

import com.myj.designpattern.DesignPattern.AbstractFactory.pizzsa.LonCheesePizzsa;
import com.myj.designpattern.DesignPattern.AbstractFactory.pizzsa.LonGreekPizzsa;
import com.myj.designpattern.DesignPattern.AbstractFactory.pizzsa.Pizzsa;

/**
 * Created by maoyujiao on 2019/8/23.
 */

public class LonFactory implements AbstractFactory {


    @Override
    public Pizzsa createPizzsa(String type) {
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
