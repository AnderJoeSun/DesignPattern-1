package com.myj.designpattern.DesignPattern.Singleton;

/**
 * Created by maoyujiao on 2019/8/22.
 * 枚举
 优缺点说明:
 1) 这借助JDK1.5中添加的枚举来实现单例模式。
 不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 2) 这种方式是Effective Java作者Josh Bloch 提倡的方式
 3) 结论:推荐使用
 */

public class SingletonTest07 {
    public static void main(String[] args){
        Singleton1 singleton1 = Singleton1.INSTANCE;
        Singleton1 singleton2 = Singleton1.INSTANCE;
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1 hashcode =" + singleton1.hashCode());
        System.out.println("singleton2 hashcode =" + singleton2.hashCode());
        Singleton1.method1();

//        Runtime

    }
}

//枚举类
enum Singleton1{
    INSTANCE;
    public static void method1(){
        System.out.println("功能1");
    }
}


