package com.myj.designpattern.DesignPattern.Flyweight;

/**
 * Created by maoyujiao on 2019/8/29.
 */

public class ConcretFlyweight extends FlyWeight {
    private String type;

    public ConcretFlyweight(String type) {
        this.type = type;
    }

    @Override
    public void run(User user) {
        System.out.println(user.getName() + "正在运行" + type +"网站");
    }
}
