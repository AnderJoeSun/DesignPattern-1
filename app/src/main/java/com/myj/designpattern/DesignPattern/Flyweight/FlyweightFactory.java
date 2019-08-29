package com.myj.designpattern.DesignPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maoyujiao on 2019/8/29.
 */

public class FlyweightFactory {

    private Map<String,FlyWeight> pool = new HashMap<>();

    public FlyWeight getFlyweight(String type){
        if(!pool.containsKey(type)) { //就创建一个网站，并放入到池中
             pool.put(type, new ConcretFlyweight(type));
        }
        return pool.get(type);
    }

    public int getCount(){
        return pool.size();
    }


}
