package com.myj.designpattern.DesignPattern.Proxy.staticProxy;

/**
 * Created by maoyujiao on 2019/8/29.
 */

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师开始教书了");
    }
}
