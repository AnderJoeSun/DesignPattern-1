package com.myj.designpattern.DesignPattern.bridge;

/**
 * Created by maoyujiao on 2019/8/26.
 */

public class Xiaomi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机打开");
    }

    @Override
    public void close() {
        System.out.println("小米手机关闭");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
