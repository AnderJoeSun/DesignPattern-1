package com.myj.designpattern.DesignPattern.adapter.ClassAdapter;

/**
 * Created by maoyujiao on 2019/8/25.
 */

public class Phone {

    public void charge(IVoltage5 adapter){
        int des = adapter.output5();
        if(des == 5){
            System.out.println("电压正常，可以充电了");
        } else if(des > 5){
            System.out.println("电压不正常，不能充电");
        }
    }
}
