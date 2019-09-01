package com.myj.designpattern.DesignPattern.Order;

/**
 * Created by maoyujiao on 2019/9/1.
 */

public class LightOnOrder implements Command {
    private LightReceiver receiver;

    public LightOnOrder(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exacute() {
        receiver.open();
    }

    @Override
    public void undo() {
        receiver.close();
    }
}
