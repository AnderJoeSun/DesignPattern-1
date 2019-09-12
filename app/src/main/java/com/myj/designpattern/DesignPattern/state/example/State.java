package com.myj.designpattern.DesignPattern.state.example;

/**
 * Created by maoyujiao on 2019/9/12.
 */

public abstract class State {
    public abstract boolean checkOrder();
    public abstract void publishOrder();
    public String getState(){

        return StateEnum.PUBLISHED.getValue();
    }
}
