package com.myj.designpattern.DesignPattern.ChainResponsibility;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class CollegueApprover extends Approver {

    @Override
    public void dispose(Request request) {
        if (request.money < 2000){
            System.out.println("院领导开始审批");
            request.approve();
        } else {
            getApprover().dispose(request);
        }

    }
}
