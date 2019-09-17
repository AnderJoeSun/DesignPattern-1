package com.myj.designpattern.DesignPattern.builder.another;

/**
 * Created by maoyujiao on 2019/9/17.
 */

public class Client {
    public static void main(String[] args){
        Computer computer = new Computer.Builder().
                setCpu("麒麟").setMemory("16g").
                setScreen("三星").setMainborad("主机XXX").build();
    }
}
