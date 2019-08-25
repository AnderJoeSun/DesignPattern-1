package com.myj.designpattern.DesignPattern.AbstractFactory.order;

import com.myj.designpattern.DesignPattern.AbstractFactory.pizzsa.Pizzsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by maoyujiao on 2019/8/23.
 基本介绍
 1) 抽象工厂模式:定义了一个interface用于创建相关或有依赖关系的对象簇，
 而无需 指明具体的类
 2) 抽象工厂模式可以将简单工厂模式和工厂方法模式进行整合。
 3) 从设计层面看，抽象工厂模式就是对简单工厂模式的改进(或者称为进一步的抽象)。
 4) 将工厂抽象成两层，AbsFactory(抽象工厂) 和 具体实现的工厂子类。程序员可以
 根据创建对象类型使用对应的工厂子类。这样将单个的简单工厂类变成了工厂簇，
 更利于代码的维护和扩展。
 5) 类图
 */

public  class OrderPizzsa {

    private AbstractFactory mSimpleFactory;

    public OrderPizzsa(AbstractFactory factory) {
        setSimpleFactory(factory);
    }

    public void setSimpleFactory(AbstractFactory simpleFactory) {
        this.mSimpleFactory = simpleFactory;
        Pizzsa pizzsa;
        do {
            String type = getType();
            pizzsa = mSimpleFactory.createPizzsa(type);
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
