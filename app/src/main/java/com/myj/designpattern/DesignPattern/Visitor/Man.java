package com.myj.designpattern.DesignPattern.Visitor;

/**
 * Created by maoyujiao on 2019/9/2.
 */

public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
