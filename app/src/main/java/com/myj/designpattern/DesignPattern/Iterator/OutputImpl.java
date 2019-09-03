package com.myj.designpattern.DesignPattern.Iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by maoyujiao on 2019/9/2.
 */

public class OutputImpl {
    private List<College> colleges;

    public OutputImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    public void printCollege(){
        Iterator iterator = colleges.iterator();
        while (iterator.hasNext()){
            printDepartment(((College)iterator.next()).createIterator());
        }
    }

    private void printDepartment(Iterator iterator){
        Department department;
        while (iterator.hasNext()){
            department = (Department) iterator.next();
            System.out.println(department.name);
        }
    }
}
