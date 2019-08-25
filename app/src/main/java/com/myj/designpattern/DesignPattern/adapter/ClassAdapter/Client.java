package com.myj.designpattern.DesignPattern.adapter.ClassAdapter;

/**
 * Created by maoyujiao on 2019/8/25.
 */

public class Client {
    public static void main(String[] args){
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter());
    }
}
