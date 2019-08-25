package com.myj.designpattern.DesignPattern.Prototype.improve.DeepClone;

import java.io.Serializable;

/**
 * Created by maoyujiao on 2019/8/25.
 */

public class DeepProtoType implements Cloneable,Serializable{
    private String loc;

    public DeepProtoType(String loc) {
        this.loc = loc;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepProtoType protoType = (DeepProtoType) super.clone();
        return protoType;
    }
}
