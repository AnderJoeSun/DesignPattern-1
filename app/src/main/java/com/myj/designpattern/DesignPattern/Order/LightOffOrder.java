package com.myj.designpattern.DesignPattern.Order;

/**
 * Created by maoyujiao on 2019/9/1.
 */

public class LightOffOrder implements Command {
    private LightReceiver receiver;

    public LightOffOrder(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exacute() {
        receiver.close();
    }

    @Override
    public void undo() {
        receiver.open();
    }
}
