package com.myj.designpattern.DependenceInversion.improve;

/**
 * Created by maoyujiao on 2019/8/21.
 *
 * 依赖倒转原则(Dependence Inversion Principle)是指:
 1) 高层模块（抽象模块）不应该依赖低层模块，二者都应该依赖其抽象
 2) 抽象不应该依赖细节，细节应该依赖抽象
 3) 依赖倒转(倒置)的中心思想是面向接口编程
 4) 依赖倒转原则是基于这样的设计理念:相对于细节的多变性，抽象的东西要稳定的 多。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在java中，抽象 指的是接口或抽象类，细节就是具体的实现类
 5) 使用接口或抽象类的目的是 "制定好规范"，而不涉及任何具体的操作，把展现细节的 任务交给他们的实现类去完成
 *
 *
 * 依赖倒转原则的注意事项和细节
 1) 低层模块尽量都要有抽象类或接口，或者两者都有，程序稳定性更好.
 2) 变量的声明类型 尽量是抽象类或接口, 这样我们的变量引用和实际对象间，就存在
 一个缓冲层，利于程序扩展和优化
 3) 继承时遵循里氏替换原则
    类不要是孤零零的一个，有接口或依赖,A extends B,则 扩充A功能时可以直接在B中进行
 */

public class DependencyInversion {
    public static void main(String[] args){
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());

    }

    interface IReceive{
        public String getInfo();
    }

    static class Email implements IReceive{
        @Override
        public String getInfo() {
            return "电子邮件信息：hello world";
        }
    }

    static class WeChat implements IReceive{
        @Override
        public String getInfo() {
            return "微信信息：hello world";
        }
    }

    /**
     *分析
     * 1.简单，容易想到
     * 2。如果我们获取的对象是微信，短信，则新增类，同时person类增加相应方法
     * 3。解决思路，引入一个抽象接口：Receiver，表示接受者，Person与该接口发生依赖，
     * 因为Email 微信都属于接收范围，她们各自实现Receiver接口就可。这就是依赖倒转原则
     */
    static class Person{
        public void receive(IReceive i) {
            System.out.println(i.getInfo());
        }
    }
}
