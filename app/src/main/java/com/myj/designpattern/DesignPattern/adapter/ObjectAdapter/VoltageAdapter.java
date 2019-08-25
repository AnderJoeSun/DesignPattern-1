package com.myj.designpattern.DesignPattern.adapter.ObjectAdapter;

/**
 * Created by maoyujiao on 2019/8/25.
 * 对象适配器模式

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
