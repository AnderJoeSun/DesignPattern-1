package com.myj.designpattern.DesignPattern.bridge;

/**
 * Created by maoyujiao on 2019/8/26.
 */

public class FolderPhone extends Phone {

    public FolderPhone(Brand brand) {
        super(brand);//不太懂为啥，抽象类不能new，而同时构造里面有参数，所以必须被覆盖
    }

    public void open() { //覆盖和重写的区别
        super.open();
        System.out.println("折叠手机打开了");
    }

    protected void close() {
        super.close();
        System.out.println("折叠手机关闭了");
    }

    protected void call() {
        super.call();
        System.out.println("折叠手机关闭了");
    }
}
