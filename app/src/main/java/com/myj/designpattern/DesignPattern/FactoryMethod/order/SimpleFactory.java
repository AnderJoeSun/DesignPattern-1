package com.myj.designpattern.DesignPattern.FactoryMethod.order;

import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.BjCheesePizzsa;
import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.BjGreekPizzsa;
import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.Pizzsa;

/**
 * Created by maoyujiao on 2019/8/23.
 */

public abstract class SimpleFactory {
    public abstract Pizzsa createPizzsa(String type);
}
