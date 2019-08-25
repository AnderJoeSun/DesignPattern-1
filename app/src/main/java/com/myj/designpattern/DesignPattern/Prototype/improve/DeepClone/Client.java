package com.myj.designpattern.DesignPattern.Prototype.improve.DeepClone;


/**
 * Created by maoyujiao on 2019/8/25.
 *
 */

public class Client {
    public static void  main(String[] args) throws CloneNotSupportedException {
       PropoTypeConcrete concrete = new PropoTypeConcrete("毛玉娇",new DeepProtoType("河南开封"));
//       PropoTypeConcrete concrete1 = (PropoTypeConcrete)concrete.clone();
       PropoTypeConcrete concrete1 = (PropoTypeConcrete)concrete.deepClone();

       System.out.println(concrete +"concrete ProtoType hashcode = "+concrete.getProtoType().hashCode());
       System.out.println(concrete1 +"concrete ProtoType hashcode = "+concrete1.getProtoType().hashCode());
    }

}