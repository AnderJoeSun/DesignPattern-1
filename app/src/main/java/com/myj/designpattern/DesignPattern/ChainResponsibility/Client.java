package com.myj.designpattern.DesignPattern.ChainResponsibility;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class Client {
    public static void main(String[] args){
        Request request = new Request(200);
        DepartmentApprover departmentApprover = new DepartmentApprover();
        CollegueApprover collegueApprover = new CollegueApprover();
        SchoolApprover schoolApprover = new SchoolApprover();

        //需要将各个审批级别的下一个设置好 (处理人构成环形: )
        departmentApprover.setApprover(collegueApprover);
        collegueApprover.setApprover(schoolApprover);
        schoolApprover.setApprover(departmentApprover);

        schoolApprover.dispose(request);
    }
}
