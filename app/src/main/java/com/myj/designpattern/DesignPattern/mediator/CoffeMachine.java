package com.myj.designpattern.DesignPattern.mediator;

/**
 * Created by maoyujiao on 2019/9/4.
 */

public class CoffeMachine extends Colleague {

    public CoffeMachine(Mediator mediator,String name) {
        super(mediator,name);
        this.getMediator().registColleague(name,this);
    }



    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(0,this.name);
    }


    public void start(){
        System.out.println("开始煮咖啡");
    }

    public void finish(){
        System.out.println("5分钟过去了");
        System.out.println("煮咖啡结束");
        sendMessage(0);
    }
}
