package com.myj.designpattern.DesignPattern.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by maoyujiao on 2019/9/2.
 */

public class InfoCollege implements College {

    private List<Department> departments;
    int numofDepartment = 0;

    public InfoCollege() {
        this.departments = new ArrayList<>();
        for(int i = 0;i< 5;i++) {
            departments.add(new Department("信息安全"+i,"信息安全"+i));
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
        return new InfoCollegeIterator(departments);
    }
}
