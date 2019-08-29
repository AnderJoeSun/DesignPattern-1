package com.myj.designpattern.DesignPattern.Proxy.staticProxy;

/**
 * Created by maoyujiao on 2019/8/29.
 */

public class Client {
    public static void main(String[] args){
        ITeacherDao target = new TeacherDao();
        ITeacherDao proxy = new TeacherDaoProxy(target);
        proxy.teach();
    }
}
