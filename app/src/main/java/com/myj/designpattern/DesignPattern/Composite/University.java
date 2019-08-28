package com.myj.designpattern.DesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maoyujiao on 2019/8/28.
 */

public class University extends OrganizationComponent {
    List<OrganizationComponent> components = new ArrayList<>();

    public University(String name, String desc) {
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
            component.getComponent();
        }
    }
}
