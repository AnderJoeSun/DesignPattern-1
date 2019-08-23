package com.myj.designpattern.DesignPattern.factory.SimpleFactory.order;

import com.myj.designpattern.DesignPattern.factory.SimpleFactory.pizzsa.Pizzsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by maoyujiao on 2019/8/23.
 * 披萨订单，会有很多，违反ocp原则
 */

public class OrderPizzsa2 {

    public OrderPizzsa2() {

        Pizzsa pizzsa;
        String type;
        do {
           type = getType();
            pizzsa = SimpleFactory2.createPizzsa(type);
            if (pizzsa != null) {
                pizzsa.prepare();
                pizzsa.bake();
                pizzsa.cut();
                pizzsa.box();
            } else {
                System.out.println("没有该类型，退出程序");
                break;
            }
        }while (true);
    }


    private String getType() {
        System.out.println("请输入pizzsa类型");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String type = reader.readLine();
            return type;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
