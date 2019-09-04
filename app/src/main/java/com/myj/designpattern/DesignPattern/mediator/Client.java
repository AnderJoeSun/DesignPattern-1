package com.myj.designpattern.DesignPattern.mediator;

/**
 * Created by maoyujiao on 2019/9/4.
 */

public class Client {
    public static void main(String[] args){
        Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator,"闹钟");
        CoffeMachine coffeMachine = new CoffeMachine(mediator,"咖啡机");
        TV tv = new TV(mediator,"电视机");
        Curtain curtain = new Curtain(mediator,"窗帘");
        alarm.start();
        coffeMachine.finish();
    }
}
