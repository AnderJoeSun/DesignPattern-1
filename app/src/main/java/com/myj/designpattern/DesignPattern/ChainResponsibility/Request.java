package com.myj.designpattern.DesignPattern.ChainResponsibility;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class Request {
    int money;

    public Request(int money) {
        this.money = money;
    }

    public void approve(){
        System.out.println("请求审批了");
    }
}
