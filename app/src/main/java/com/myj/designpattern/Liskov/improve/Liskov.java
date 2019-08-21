package com.myj.designpattern.Liskov.improve;

/**
 * Created by maoyujiao on 2019/8/21.
 *
 * OO中的继承性的思考和说明
 1) 继承包含这样一层含义:父类中凡是已经实现好的方法，实际上是在设定规范和契
 约，虽然它不强制要求所有的子类必须遵循这些契约，但是如果子类对这些已经实
 现的方法任意修改，就会对整个继承体系造成破坏。
 2) 继承在给程序设计带来便利的同时，也带来了弊端。比如使用继承会给程序带来侵 入性，程序的可移植性降低，增加对象间的耦合性，如果一个类被其他的类所继承， 则当这个类需要修改时，必须考虑到所有的子类，并且父类修改后，所有涉及到子 类的功能都有可能产生故障
 3) 问题提出:在编程中，如何正确的使用继承? => 里氏替换原则


 基本介绍
 1) 里氏替换原则(Liskov Substitution Principle)在1988年，由麻省理工学院的以为姓里 的女士提出的。
 2) 如果对每个类型为T1的对象o1，都有类型为T2的对象o2，
 使得以T1定义的所有程序 P在所有的对象o1都代换成o2时，
 程序P的行为没有发生变化，那么类型T2是类型T1 的子类型。
 换句话说，所有引用基类的地方必须能透明地使用其子类的对象。
 3) 在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法
 4) 里氏替换原则告诉我们，继承实际上让两个类耦合性增强了，
 在适当的情况下，可 以通过聚合，组合，依赖 来解决问题。.
 */

public class Liskov {

    public static void main(String[] args){
        A a = new A();
        System.out.println("11 - 3 = " + a.fun1(11,3));

        B b = new B();
        //因为B类不在继承A，因此调用者不会再fun1的减法
        System.out.println("11 + 3 = " + b.fun1(11,3));
        System.out.println("11 + 3 + 9 = " + b.fun2(11,3));

        //使用组合依然可以调用A的方法
        System.out.println("11 - 3 = " + b.fun3(11,3));


    }

    static class Base{
        //把更基础的功能写在这里
    }

    static class A extends Base {
        public int fun1(int num1,int num2){
            return num1 - num2;
        }
    }

    static class B extends Base {
        private A a = new A(); //组合方式
        public int fun1(int num1,int num2){
            return num1 + num2;
        }

        public int fun2(int num1,int num2){
            return fun1(num1,num2) + 9;
        }

        public int fun3(int num1,int num2){
            return a.fun1(num1,num2);
        }
    }
}
