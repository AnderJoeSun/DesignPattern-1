package com.myj.designpattern.DesignPattern.observer;

/**
 * Created by maoyujiao on 2019/9/3.
 */

public class Client {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        weatherData.registObserver(new CurrentWeather());
        weatherData.registObserver(new Sina());
        weatherData.setData("30摄氏度","干燥","高压");
    }
}
