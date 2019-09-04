package com.myj.designpattern.DesignPattern.mediator;

/**
 * Created by maoyujiao on 2019/9/4.
 */

public class TV extends Colleague {


    public TV(Mediator mediator, String name) {
        super(mediator, name);
        this.getMediator().registColleague(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {

    }

    public void start(){
        System.out.println("打开电视");
    }

    public void close(){
        System.out.println("关闭电视");
    }


}
