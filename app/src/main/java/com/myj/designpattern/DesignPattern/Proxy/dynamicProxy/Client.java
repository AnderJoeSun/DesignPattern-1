package com.myj.designpattern.DesignPattern.Proxy.dynamicProxy;


/**
 * Created by maoyujiao on 2019/8/29.
 */

public class Client {
    public static void main(String[] args){
        ITeacherDao target = new TeacherDao();
        ITeacherDao proxy = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
        proxy.teach();
    }
}
