package com.myj.designpattern.DesignPattern.bridge;

/**
 * Created by maoyujiao on 2019/8/26.
 */

public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("vivo手机打开");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关闭");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话");
    }
}
