package com.myj.designpattern.DesignPattern.bridge;

/**
 * Created by maoyujiao on 2019/8/26.
 */

public abstract class Phone {
    public Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open(){
        brand.open();
    }

    protected void close(){
        brand.close();
    }

    protected void call(){
        brand.call();
    }
}
