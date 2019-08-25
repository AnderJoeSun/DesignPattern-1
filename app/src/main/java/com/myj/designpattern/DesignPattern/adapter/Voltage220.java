package com.myj.designpattern.DesignPattern.adapter;

/**
 * Created by maoyujiao on 2019/8/25.
 */

public class Voltage220 {
    public int output220(){
        int src = 220;
        System.out.println("原电压是"+src);
        return src;
    }
}
