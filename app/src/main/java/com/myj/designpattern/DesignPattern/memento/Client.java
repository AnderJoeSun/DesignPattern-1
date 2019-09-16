package com.myj.designpattern.DesignPattern.memento;

/**
 * Created by maoyujiao on 2019/9/16.
 */

public class Client {
    public static void main(String[] args){
        Orginator originator = new Orginator();
        CareTaker caretaker = new CareTaker();
        originator.setState(" 状态#1 攻击力 100 "); //保存了当前的状态
        caretaker.addMemento(originator.saveMemento());
        originator.setState(" 状态#2 攻击力 80 ");
        caretaker.addMemento(originator.saveMemento());
        originator.setState(" 状态#3 攻击力 50 ");
        caretaker.addMemento(originator.saveMemento());
        System.out.println("当前的状态是 =" + originator.getState()); //希望得到状态 1, 将 originator 恢复到状态 1
        originator.getStateFromMemento(caretaker.getMemento(0));
        System.out.println("恢复到状态 1 , 当前的状态是");
        System.out.println("当前的状态是 =" + originator.getState());
    }
}
