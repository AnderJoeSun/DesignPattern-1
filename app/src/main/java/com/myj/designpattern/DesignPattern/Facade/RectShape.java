package com.myj.designpattern.DesignPattern.Facade;

/**
 * Created by maoyujiao on 2019/9/17.
 */

public class RectShape implements Shape {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}
