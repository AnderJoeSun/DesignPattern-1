package com.myj.designpattern.DesignPattern.AbstractFactory.order;

import com.myj.designpattern.DesignPattern.AbstractFactory.pizzsa.Pizzsa;

/**
 * Created by maoyujiao on 2019/8/23.
 */

interface AbstractFactory {
    public Pizzsa createPizzsa(String type);
}
