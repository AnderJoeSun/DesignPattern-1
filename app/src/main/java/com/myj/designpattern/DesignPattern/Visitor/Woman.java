package com.myj.designpattern.DesignPattern.Visitor;

/**
 * Created by maoyujiao on 2019/9/2.
 * 1.这里我们用到双分派，即首先在客户点程序中，将具体状态作为参数传递Woman中（第一次分派）
 * 2。然后woman，类调用作为参数的"具体方法"中方法getWomanResult(),同时将自己（this）
 * 作为参数传入，完成第二次分派
 */

public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
