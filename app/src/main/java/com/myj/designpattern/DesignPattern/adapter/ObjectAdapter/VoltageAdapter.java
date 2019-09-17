package com.myj.designpattern.DesignPattern.adapter.ObjectAdapter;

/**
 * Created by maoyujiao on 2019/8/25.
 * 对象适配器模式
 1) 基本思路和类的适配器模式相同，只是将Adapter类作修改，不是继承src类，而是持有src类的实例，以解决
 兼容性的问题。 即:持有 src 类，实现 dst 类接口，完成 src->dst 的适配
 2) 根据“合成复用原则”，在系统中尽量使用关联关系(聚合)来替代继承关系。
 3) 对象适配器模式是适配器模式常用的一种
 */

public class VoltageAdapter implements IVoltage5 {
    private Voltage220 voltage220;

    public VoltageAdapter(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int output5() {
        int src = voltage220.output220();
        int des = src / 44;
        System.out.println("变换后对电压"+des);
        return des;
    }
}
