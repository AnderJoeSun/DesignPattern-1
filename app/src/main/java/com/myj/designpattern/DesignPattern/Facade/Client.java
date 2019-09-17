package com.myj.designpattern.DesignPattern.Facade;

/**
 * Created by maoyujiao on 2019/9/17.
 */

public class Client {
    public static void main(String[] args){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
    }
}
