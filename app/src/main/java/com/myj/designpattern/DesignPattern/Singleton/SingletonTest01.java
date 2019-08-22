package com.myj.designpattern.DesignPattern.Singleton;

/**
 * Created by maoyujiao on 2019/8/22.
 * 饿汉式（静态常量）1.构造私有化 2。静态属性（类的内部创建对象）3.提供一个公有静态方法返回实例
 *
 *
 * 饿汉式(静态常量) 优缺点说明:
 1) 优点:这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同 步问题。
 2) 缺点:在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始 至终从未使用过这个实例，则会造成内存的浪费
 3) 这种方式基于classloder机制避免了多线程的同步问题（类加载是线程安全的），不过，instance在类装载
 时就实例化，在单例模式中大多数都是调用getInstance方法， 但是导致类装载
 的原因有很多种，因此不能确定有其他的方式(或者其他的静态方法)导致类 装载，这时候初始化instance就没有达到lazy loading的效果
 4) 结论:这种单例模式可用，可能造成内存浪费
 */

public class SingletonTest01 {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1 hashcode =" + singleton1.hashCode());
        System.out.println("singleton2 hashcode =" + singleton2.hashCode());

    }

    static class Singleton{
        private final static Singleton singleton = new Singleton();

        private Singleton() {
        }

        public static Singleton getSingleton(){
            return singleton;
        }
    }
}
