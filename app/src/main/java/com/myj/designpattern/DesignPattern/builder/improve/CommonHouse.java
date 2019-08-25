package com.myj.designpattern.DesignPattern.builder.improve;


/**
 * Created by maoyujiao on 2019/8/25.
 */

public class CommonHouse extends HouseBuilder {


    @Override
    public void buildBasic() {
        house.setBasic("普通房子地基5米");
        System.out.println("普通房打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房建墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房封顶");
    }
}
