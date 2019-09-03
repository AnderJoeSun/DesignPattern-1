package com.myj.designpattern.DesignPattern.observer;

/**
 * Created by maoyujiao on 2019/9/3.
 * 订阅者，也可以不写该接口
 */

public interface Subject {
    void registObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();

}
