package com.myj.designpattern.DesignPattern.Iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by maoyujiao on 2019/9/2.
 */

public class InfoCollegeIterator implements Iterator {
    private List<Department> departments;
    private int curPos= 0;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(curPos > departments.size() - 1 || departments == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments.get(curPos);
        curPos += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
