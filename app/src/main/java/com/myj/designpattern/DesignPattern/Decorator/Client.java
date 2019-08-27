package com.myj.designpattern.DesignPattern.Decorator;

/**
 * Created by maoyujiao on 2019/8/27.
 */

public class Client {
    public static void main(String[] args){
        Drink order = new BlackCoffee();
        order = new Milk(order);
        System.out.println("咖啡价格："+ order.cost());
        System.out.println(order.getDesc());

        Drink order2 = new LatteCoffee();
        order2 = new Chocolate(order2);
        System.out.println("咖啡价格："+ order2.cost());
        System.out.println(order2.getDesc());
    }
}
