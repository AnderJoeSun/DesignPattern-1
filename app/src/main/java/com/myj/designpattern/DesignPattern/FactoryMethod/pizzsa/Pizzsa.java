package com.myj.designpattern.DesignPattern.FactoryMethod.pizzsa;

/**
 * Created by maoyujiao on 2019/8/23.
 */

public abstract class Pizzsa {
    private String name;
    public abstract void prepare();

    public  void bake(){
        System.out.println(name + "烘烤");
    }

    public  void box() {
        System.out.println(name + "打包");

    }

    public  void cut(){
        System.out.println(name + "切割");
    }

    public void setName(String name) {
        this.name = name;
    }
}
