package com.myj.designpattern.DesignPattern.Decorator;

/**
 * Created by maoyujiao on 2019/8/27.
 *
 * 装饰者模式原理
 1) 装饰者模式就像打包一个快递
  主体:比如:陶瓷、衣服 (Component) // 被装饰者
  包装:比如:报纸填充、塑料泡沫、纸板、木板(Decorator)
 2) Component：主体:比如类似前面的Drink
 3) ConcreteComponent和Decorator ConcreteComponent:具体的主体， 比如前面的各个单品咖啡
 Decorator: 装饰者，比如各调料.
 4) 在如图的Component与ConcreteComponent之间，
 如果 ConcreteComponent类很多,还可以设计一个缓冲层，
 将共有的部分提取出来， 抽象层一个类。

 说明
 1) Drink 类就是前面说的抽象类， Component
 2) ShortBlack 就单品咖啡
 3) Decorator 是一个装饰类，含有一个被装饰的对象(Drink obj)
 4) Decorator 的cost 方法 进行一个费用的叠加计算，递归的计算价格
 */

public class MixDecorator extends Drink {
    private Drink body;

    public MixDecorator(Drink body) {
        this.body = body;
    }

    @Override
    public float cost() {
        return getPrice() + body.cost();
    }

    @Override
    public String getDesc() {
        return body.getDesc() +"添加"+super.getDesc();
    }
}
