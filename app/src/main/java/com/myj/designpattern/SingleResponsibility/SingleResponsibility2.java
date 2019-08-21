package com.myj.designpattern.SingleResponsibility;

/**
 * Created by maoyujiao on 2019/8/21.
 * 遵守单一职责原则，但改动太大，即将类分解，同时修改客户端
 * 改进：直接修改Vehicle类，改动但代码会比较少
 */

public class SingleResponsibility2 {

    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        new VehicleAir().run("飞机");
        new VehicleAir().run("轮船");

    }

     static class Vehicle{
        public void run(String vehicle){
            System.out.println(vehicle +"在公路上跑");
        }
     }

    static class VehicleAir{
        public void run(String vehicle){
            System.out.println(vehicle +"在天上跑");
        }
    }

    static class VehicleWater{
        public void run(String vehicle){
            System.out.println(vehicle +"在水上跑");
        }
    }

}
