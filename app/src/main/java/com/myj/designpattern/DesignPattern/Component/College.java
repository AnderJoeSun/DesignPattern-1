package com.myj.designpattern.DesignPattern.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maoyujiao on 2019/8/28.
 */

public class College extends OrganizationComponent {
    List<OrganizationComponent> components = new ArrayList<>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void addComponent(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    protected void removeComponent(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    protected void getComponent() {
        System.out.println("------"+getName()+"------");
        for(OrganizationComponent component : components){
            System.out.println(component.getName());
        }
    }
}
