package com.myj.designpattern.DesignPattern.Iterator;

import java.util.Iterator;

/**
 * Created by maoyujiao on 2019/9/2.
 */

public class ComputerCollegeIterator implements Iterator {
    private Department[] departments;
    private int curPos= 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(curPos > departments.length - 1 || departments == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[curPos];
        curPos += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
