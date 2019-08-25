package com.myj.designpattern.DesignPattern.builder;

/**
 * Created by maoyujiao on 2019/8/25.
 */

public class HighBuilding extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼建墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
