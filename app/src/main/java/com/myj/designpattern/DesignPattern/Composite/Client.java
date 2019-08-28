package com.myj.designpattern.DesignPattern.Composite;

/**
 * Created by maoyujiao on 2019/8/28.
 */

public class Client {
    public static void main(String[] args){
        OrganizationComponent university = new University("清华大学","中国最高学府");

        OrganizationComponent college1 = new College("计算机系","计算机系");
        OrganizationComponent college2 = new College("机械系","机械系");

        university.addComponent(college1);
        university.addComponent(college2);

        college1.addComponent(new Department("计算机科学与技术","计算机科学与技术"));
        college1.addComponent(new Department("网络安全","网络安全"));

        college2.addComponent(new Department("机械设计","机械设计"));
        college2.addComponent(new Department("机械制造","机械制造"));

//        university.getComponent();
        college1.getComponent();

    }
}
