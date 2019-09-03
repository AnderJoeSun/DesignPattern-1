package com.myj.designpattern.DesignPattern.Iterator;

import java.util.Iterator;

/**
 * Created by maoyujiao on 2019/9/2.
 */

public class ComputerCollege implements College {

    private Department[] departments;


    public ComputerCollege() {
        this.departments = new Department[5];
        for(int i = 0;i< 5;i++) {
            departments[i] = new Department("计科"+i,"计算机科学与技术"+i);
        }
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void addDepartment(String name, String desc) {

    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
