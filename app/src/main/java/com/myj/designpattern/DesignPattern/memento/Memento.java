package com.myj.designpattern.DesignPattern.memento;

/**
 * Created by maoyujiao on 2019/9/5.
 * 要保存的信息，存放在一个类里面
 */

public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
