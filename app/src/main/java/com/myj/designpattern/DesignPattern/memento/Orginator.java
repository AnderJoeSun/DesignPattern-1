package com.myj.designpattern.DesignPattern.memento;

import com.myj.designpattern.DesignPattern.state.example.State;

/**
 * Created by maoyujiao on 2019/9/16.
 */

public class Orginator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
