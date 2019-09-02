package com.myj.designpattern.DesignPattern.Visitor;

/**
 * Created by maoyujiao on 2019/9/2.
 */

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人的评价的结果是成功");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人的评价的结果是成功");
    }
}
