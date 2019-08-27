package com.myj.designpattern.DesignPattern.bridge;

/**
 * Created by maoyujiao on 2019/8/26.
 */

public class Client {
    public static void main(String[] args){
        Phone phone = new UpRightPhone(new Vivo());
        phone.open();
        phone.call();
        phone.close();
    }
}
