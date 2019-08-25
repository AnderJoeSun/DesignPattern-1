package com.myj.designpattern.DesignPattern.adapter.InterfaceAdapter;

/**
 * Created by maoyujiao on 2019/8/25.
 *
 * 接口适配器模式介绍:如匿名内部类
 1) 一些书籍称为:适配器模式(Default Adapter Pattern)或缺省适配器模式。
 2) 当不需要全部实现接口提供的方法时，可先设计一个抽象类实现接口，
 并为该接 口中每个方法提供一个默认实现(空方法)，那么该抽象类的子类可有选择地覆
 盖父类的某些方法来实现需求
 3) 适用于一个接口不想使用其所有的方法的情况。
 */

public class Client {
    public static void main(String[] agrs){
        IInterface adapter = new IInterface(){

            @Override
            public void method1() {
                System.out.println("实现方法1");
            }

            @Override
            public void method2() {

            }

            @Override
            public void method3() {

            }

            @Override
            public void method4() {

            }
        };

        adapter.method1();
    }
}
