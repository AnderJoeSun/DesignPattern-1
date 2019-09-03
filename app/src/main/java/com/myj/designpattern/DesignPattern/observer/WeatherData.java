package com.myj.designpattern.DesignPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maoyujiao on 2019/9/3.
 */

public class WeatherData implements Subject {
    private List<Observer> observers;
    private String wendu;
    private String shidu;
    private String qiya;


    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void setData(String wendu,String shidu,String qiya){
        this.wendu = wendu;
        this.shidu = shidu;
        this.qiya = qiya;
        notifyObserver();
    }

    @Override
    public void registObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }

    }

    @Override
    public void notifyObserver() {
        for(Observer o:observers){
            o.update();
        }
    }
}
