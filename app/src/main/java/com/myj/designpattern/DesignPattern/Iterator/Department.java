package com.myj.designpattern.DesignPattern.Iterator;

/**
 * Created by maoyujiao on 2019/9/2.
 */

public class Department {
    String name;
    String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
