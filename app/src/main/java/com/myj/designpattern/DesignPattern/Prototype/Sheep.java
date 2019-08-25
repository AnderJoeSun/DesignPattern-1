package com.myj.designpattern.DesignPattern.Prototype;

/**
 * Created by maoyujiao on 2019/8/25.
 */

public class Sheep{
    private String name;
    private String age;
    private String color;

    public Sheep(String name, String age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Sheep [ name = "+name +", age = "+age +", color = "+ color +" ]";
    }
}
