package com.myj.designpattern.DesignPattern.Iterator;

import java.util.Iterator;

/**
 * Created by maoyujiao on 2019/9/2.
 */

public interface College {
    public String getName();
    public void addDepartment(String name,String desc);
    public Iterator createIterator();
}
