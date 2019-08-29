package com.myj.designpattern.DesignPattern.Proxy.staticProxy;

/**
 * Created by maoyujiao on 2019/8/29.
 */

public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理对象开始了");
        target.teach();
        System.out.println("代理对象提交了");

    }
}
