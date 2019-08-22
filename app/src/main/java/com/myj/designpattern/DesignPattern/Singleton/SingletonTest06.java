package com.myj.designpattern.DesignPattern.Singleton;

/**
 * Created by maoyujiao on 2019/8/22.
 * 静态内部类（线程安全和懒加载）
 优缺点说明:
 1) 这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
 2) 静态内部类方式在Singleton类被装载时并不会立即实例化，
 而是在需要实例化 时，调用getInstance方法，才会装载SingletonInstance类，
 从而完成Singleton的实例化。
 3) 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们
 保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 4) 优点:避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 5) 结论:推荐使用.
 */

public class SingletonTest06 {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1 hashcode =" + singleton1.hashCode());
        System.out.println("singleton2 hashcode =" + singleton2.hashCode());

    }
}

 class Singleton{

    private Singleton() {
    }

    private static class SingletonInstance{
        private static final Singleton singleton = new Singleton();
    }

    public static Singleton getSingleton(){
        return SingletonInstance.singleton;
    }

}


