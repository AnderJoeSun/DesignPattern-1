package com.myj.designpattern.DesignPattern.Singleton;

/**
 * Created by maoyujiao on 2019/8/22.
 * 懒汉式（线程安全，同步方法）
 优缺点说明:
 1) 解决了线程不安全问题
 2) 效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行
 同步。而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，
 直接return就行了。方法进行同步效率太低 3) 结论:在实际开发中，不推荐使用这种方式
 */

public class SingletonTest04 {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1 hashcode =" + singleton1.hashCode());
        System.out.println("singleton2 hashcode =" + singleton2.hashCode());

    }

    static class Singleton{

        private static Singleton singleton ;

        private Singleton() {
        }

        public static synchronized Singleton getSingleton(){
            if(singleton == null){
                singleton = new Singleton();
            }
            return singleton;
        }

        //同步代码块

        /**
         * @return
         * 优缺点说明:
        1) 这种方式，本意是想对第四种实现方式的改进，因为上面同步方法效率太低， 改为同步产生实例化的的代码块
        2) 但是这种同步并不能起到线程同步的作用。跟第3种实现方式遇到的情形一 致，
        假如一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，
        另一个线程也通过了这个判断语句，这时便会产生多个实例
        3) 结论:在实际开发中，不能使用这种方式
         */
        public static  Singleton getSingleton2(){
            if(singleton == null){
                synchronized(Singleton.class){
                    singleton = new Singleton();
                }
            }
            return singleton;
        }
    }

}


