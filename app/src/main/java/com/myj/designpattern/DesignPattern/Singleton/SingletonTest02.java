package com.myj.designpattern.DesignPattern.Singleton;

/**
 * Created by maoyujiao on 2019/8/22.
 * 饿汉式（静态代码块）
 * 优缺点说明:
 1) 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块 中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优 缺点和上面是一样的。
 2) 结论:这种单例模式可用，但是可能造成内存浪费
 */

public class SingletonTest02 {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1 hashcode =" + singleton1.hashCode());
        System.out.println("singleton2 hashcode =" + singleton2.hashCode());

    }

    static class Singleton{

        static {
            singleton = new Singleton();
        }

        private static Singleton singleton ;

        private Singleton() {
        }

        public static Singleton getSingleton(){
            return singleton;
        }
    }

}


