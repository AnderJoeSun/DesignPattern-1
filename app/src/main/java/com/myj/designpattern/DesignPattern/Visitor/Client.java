package com.myj.designpattern.DesignPattern.Visitor;

/**
 * Created by maoyujiao on 2019/9/2.
 */

public class Client {
    public static void main(String[] args){
        ObjectStructer structer = new ObjectStructer();
        structer.attach(new Man());
        structer.attach(new Man());
        structer.attach(new Woman());
        structer.display(new Success());
        structer.display(new Fail());
    }
}
