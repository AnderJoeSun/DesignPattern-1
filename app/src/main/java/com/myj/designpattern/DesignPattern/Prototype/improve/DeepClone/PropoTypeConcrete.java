package com.myj.designpattern.DesignPattern.Prototype.improve.DeepClone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by maoyujiao on 2019/8/25.
 *
 * 深拷贝基本介绍
 1) 复制对象的所有基本数据类型的成员变量值
 2) 为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变
 量所引用的对象，直到该对象可达的所有对象。也就是说，对象进行深拷贝要对 整个对象进行拷贝
 3) 深拷贝实现方式1:重写clone方法来实现深拷贝
 4) 深拷贝实现方式2:通过对象序列化实现深拷贝(推荐)
 */

public class PropoTypeConcrete implements Cloneable, Serializable {
    private String name;
    private DeepProtoType protoType;

    public PropoTypeConcrete(String name, DeepProtoType protoType) {
        this.name = name;
        this.protoType = protoType;
    }

    public DeepProtoType getProtoType() {
        return protoType;
    }

    //方法1 通过clone实现深拷贝,引用对象也通过clone方法重新设置
    @Override
    protected Object clone() throws CloneNotSupportedException {
        PropoTypeConcrete concrete = (PropoTypeConcrete) super.clone();
        concrete.protoType = (DeepProtoType) protoType.clone();
        return concrete;
    }


    //方法2 序列化方式
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //把当前对象以对象流的方式输出，也就是序列化

            bis = new ByteArrayInputStream(bos.toByteArray()); //反序列化
            ois = new ObjectInputStream(bis);
            PropoTypeConcrete copyObj = (PropoTypeConcrete) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bis.close();
                ois.close();
                bos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
