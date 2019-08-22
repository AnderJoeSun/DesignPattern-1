package com.myj.designpattern.DesignPattern.Singleton;

/**
 * Created by maoyujiao on 2019/8/22.
 * 双重检查（线程安全和效率）
 优缺点说明:
 1) Double-Check概念是多线程开发中常使用到的，如代码中所示，
 我们进行了两 次if (singleton == null)检查，这样就可以保证线程安全了。
 2) 这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，
 直接return实例化对象，也避免的反复进行方法同步（低效）.
 3) 线程安全;延迟加载;效率较高
 4) 结论:在实际开发中，推荐使用这种单例设计模式
 */

public class SingletonTest05 {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1 hashcode =" + singleton1.hashCode());
        System.out.println("singleton2 hashcode =" + singleton2.hashCode());

    }

    static class Singleton{

        private  static volatile Singleton singleton ; //volatile 随即刷新内存，同时起到线程安全的作用

        private Singleton() {
        }

        public static Singleton getSingleton(){
            if(singleton == null){
                synchronized (Singleton.class){ //同步方法，也是只能有一个线程进入
                    if(singleton == null){
                        singleton = new Singleton();
                    }
                }
            }
            return singleton;
        }

    }

}


