package com.myj.designpattern.DesignPattern.ChainResponsibility;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class DepartmentApprover extends Approver {

    @Override
    public void dispose(Request request) {
        if (request.money < 1000){
            System.out.println("系领导开始审批");
            request.approve();
        } else {
            getApprover().dispose(request);
        }

    }
}
