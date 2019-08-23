package com.myj.designpattern.DesignPattern.FactoryMethod.order;

import com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa.Pizzsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by maoyujiao on 2019/8/23.
 * 披萨订单，会有很多，违反ocp原则
 * 传统的方式的优缺点
 1) 优点是比较好理解，简单易操作。
 2) 缺点是违反了设计模式的ocp原则，即对扩展开放，对修改关闭。即当我们给类增
 加新功能的时候，尽量不修改代码，或者尽可能少修改代码.
 3) 比如我们这时要新增加一个Pizza的种类(Pepper披萨)，我们需要做如下修改.

 4) 改进的思路分析
 分析:修改代码可以接受，但是如果我们在其它的地方也有创建Pizza的代码，
 就意味 着，也需要修改，而创建Pizza的代码，往往有多处。
 思路:把创建Pizza对象封装到一个类中，这样我们有新的Pizza种类时，
 只需要修改该 类就可，其它有创建到Pizza对象的代码就不需要修改了.
 -> 简单工厂模式
 */

public  class OrderPizzsa {

    private SimpleFactory mSimpleFactory;

    public OrderPizzsa(SimpleFactory factory) {
        setSimpleFactory(factory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
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
