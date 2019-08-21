package com.myj.designpattern.DependenceInversion.improve;

/**
 * Created by maoyujiao on 2019/8/21.
 *
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
