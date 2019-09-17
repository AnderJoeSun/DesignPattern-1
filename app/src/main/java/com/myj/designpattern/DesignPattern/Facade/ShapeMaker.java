package com.myj.designpattern.DesignPattern.Facade;

/**
 * Created by maoyujiao on 2019/9/17.
 */

public class ShapeMaker {
    private Shape rect;
    private Shape circle;
    private Shape trigle;

    public ShapeMaker() {
        rect = new RectShape();
        circle = new CircleShape();
        trigle = new TrigleShape();
    }

    public void drawRect(){
        rect.draw();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawTriglet(){
        trigle.draw();
    }
}
