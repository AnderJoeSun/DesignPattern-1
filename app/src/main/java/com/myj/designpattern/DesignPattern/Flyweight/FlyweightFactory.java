package com.myj.designpattern.DesignPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maoyujiao on 2019/8/29.
 */

public class FlyweightFactory {

    private Map<String,FlyWeight> list = new HashMap<>();

    public FlyWeight getFlyweight(String type){
        if(list.containsKey(type)){
            return list.get(type);
        }else {
            return new ConcretFlyweight(type);
        }
    }


}
