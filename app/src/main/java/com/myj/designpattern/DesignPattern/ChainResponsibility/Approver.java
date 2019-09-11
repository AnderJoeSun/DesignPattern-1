package com.myj.designpattern.DesignPattern.ChainResponsibility;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public abstract class Approver {
    private String name;
    private Approver approver;
    public abstract void dispose(Request request);

    public Approver getApprover() {
        return approver;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }
}
