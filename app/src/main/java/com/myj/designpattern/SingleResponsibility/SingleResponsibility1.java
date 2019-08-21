package com.myj.designpattern.SingleResponsibility;

/**
 * Created by maoyujiao on 2019/8/21.
 * 单一职责原则介绍
 */

public class SingleResponsibility1 {

    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");

    }

     static class Vehicle{
        public void run(String vehicle){
            System.out.println(vehicle +"在公路上跑");
        }
     }

}
