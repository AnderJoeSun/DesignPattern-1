package com.myj.designpattern.DesignPattern.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maoyujiao on 2019/9/3.
 */

public interface Mediator {
    void getMessage(int stateChange,String colleagueName);
    void registColleague(String key,Colleague colleague);

}
