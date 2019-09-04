package com.myj.designpattern.DesignPattern.mediator;

/**
 * Created by maoyujiao on 2019/9/3.
 */

public abstract class Colleague {

    public Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public  Mediator getMediator(){
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);
}
