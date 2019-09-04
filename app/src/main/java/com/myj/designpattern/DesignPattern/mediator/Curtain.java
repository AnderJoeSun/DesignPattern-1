package com.myj.designpattern.DesignPattern.mediator;

/**
 * Created by maoyujiao on 2019/9/4.
 */

public class Curtain extends Colleague {

    public Curtain(Mediator mediator, String name) {
        super(mediator, name);
        this.getMediator().registColleague(name,this);
    }



    @Override
    public void sendMessage(int stateChange) {

    }

    public void open(){
        System.out.println("打开窗帘");
    }


}
