package com.myj.designpattern.DesignPattern.FactoryMethod.order;

import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.Pizzsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by maoyujiao on 2019/8/23.
 *
 * 工厂方法模式介绍
 工厂方法模式设计方案:将披萨项目的实例化功能抽象成抽象方法，在不同的口味点
 餐子类中具体实现。
 工厂方法模式:定义了一个创建对象的抽象方法，由子类决定要实例化的类。
 工厂方 法模式将对象的实例化推迟到子类。
 */

public abstract class OrderPizzsa {

    public abstract Pizzsa createPizzssa(String type);

    public OrderPizzsa() {
        Pizzsa pizzsa = null;
        do{
            String type = getType();
            pizzsa = createPizzssa(type);
            if (pizzsa != null){
                pizzsa.prepare();
                pizzsa.bake();
                pizzsa.cut();
                pizzsa.box();
            } else {
                System.out.println("暂无该类型，退出程序");
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

