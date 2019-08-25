package com.myj.designpattern.DesignPattern.builder.improve;

/**
 * Created by maoyujiao on 2019/8/25.
 */

public class HouseDirector {
    HouseBuilder houseBuilder;

    public void setHouse(HouseBuilder house) {
        this.houseBuilder = house;

    }

    public HouseDirector(HouseBuilder house) {
        this.houseBuilder = house;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
