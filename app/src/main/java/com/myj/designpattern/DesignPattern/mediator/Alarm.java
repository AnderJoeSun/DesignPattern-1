package com.myj.designpattern.DesignPattern.mediator;

/**
 * Created by maoyujiao on 2019/9/4.
 */

public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        this.getMediator().registColleague(name,this);
    }

    public void start(){
        System.out.println("闹钟响了");
        sendMessage(0);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,name);
    }
}
