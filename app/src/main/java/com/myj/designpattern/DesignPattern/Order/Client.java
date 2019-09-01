package com.myj.designpattern.DesignPattern.Order;

/**
 * Created by maoyujiao on 2019/9/1.
 */

public class Client {
    public static void main(String[] args){
        RemoteControl control = new RemoteControl();
        LightReceiver receiver = new LightReceiver();
        control.setCommand(1,new LightOnOrder(receiver),new LightOffOrder(receiver));
        control.onCommandPush(1);
        control.offCommandPush(1);
        control.undo();
        control.undo();

    }
}
