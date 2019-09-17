package com.myj.designpattern.DesignPattern.Proxy.dynamicProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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
