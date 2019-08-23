package com.myj.designpattern.DesignPattern.FactoryMethod.order;

import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.BjCheesePizzsa;
import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.BjGreekPizzsa;
import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.Pizzsa;
import com.myj.designpattern.DesignPattern.factory.SimpleFactory.pizzsa.CheesePizzsa;
import com.myj.designpattern.DesignPattern.factory.SimpleFactory.pizzsa.GreekPizzsa;

/**
 * Created by maoyujiao on 2019/8/23.
 */

public class BjFactory extends SimpleFactory {


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
