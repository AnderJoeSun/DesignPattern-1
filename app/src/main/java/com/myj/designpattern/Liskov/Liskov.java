package com.myj.designpattern.Liskov;

/**
 * Created by maoyujiao on 2019/8/21.
 */

public class Liskov {

    public static void main(String[] args){
        A a = new A();
        System.out.println("11 - 3 = " + a.fun1(11,3));

        B b = new B();
        System.out.println("11 - 3 = " + b.fun1(11,3));
        System.out.println("11 + 3 + 9 = " + b.fun2(11,3));


    }

    static class A {
        public int fun1(int num1,int num2){
            return num1 - num2;
        }
    }

    static class B extends A {
        //重写了A的方法，可能是无意识的，造成功能错误
        //实际编程中我们常常重写父类方法来完成新功能，这样虽然简单，
        //但整个继承体系的复用性会比较差，特别是运行多态比较频繁的时候
        //通用的额做法是，原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉，采用依赖，聚合，组合等关系替代
        public int fun1(int num1,int num2){
            return num1 + num2;
        }

        public int fun2(int num1,int num2){
            return fun1(num1,num2) + 9;
        }
    }
}
