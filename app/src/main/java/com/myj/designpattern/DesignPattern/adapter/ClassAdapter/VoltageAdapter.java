package com.myj.designpattern.DesignPattern.adapter.ClassAdapter;

/**
 * Created by maoyujiao on 2019/8/25.
 * 类适配器模式
 * 类适配器模式介绍
 基本介绍:Adapter类，通过继承 src类，实现 dst 类接口，完成src->dst的适配

 类适配器模式注意事项和细节
 1) Java是单继承机制，所以类适配器需要继承src类这一点算是一个缺点, 因为这要 求dst必须是接口，有一定局限性;
 2) src类的方法在Adapter中都会暴露出来，也增加了使用的成本。
 3) 由于其继承了src类，所以它可以根据需求重写src类的方法，使得Adapter的灵
 活性增强了。
 */

public class VoltageAdapter extends Voltage220 implements IVoltage5 {
    @Override
    public int output5() {
        int src = output220();
        int des = src / 44;
        System.out.println("变换后对电压"+des);
        return des;
    }
}
