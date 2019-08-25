package com.myj.designpattern.DesignPattern.builder.improve;


/**
 * Created by maoyujiao on 2019/8/25.
 */

public class client {
    public static void main(String[] args){
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector director = new HouseDirector(commonHouse);
        House house = director.constructHouse();
        System.out.println(house.getBasic());

    }
}
