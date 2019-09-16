package com.myj.designpattern.DesignPattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maoyujiao on 2019/9/16.
 * 存在着保存的历史状态
 *
 * //如果只保存一次状态
 private Memento memento;
 //对 GameRole 保存多次状态
 //private ArrayList<Memento> mementos; //对多个游戏角色保存多个状态
 //private HashMap<String, ArrayList<Memento>> rolesMementos;
 */

public class CareTaker {
    private List<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento memento){
        mementos.add(memento);
    }

    public Memento getMemento(int index){
        return mementos.get(index);
    }
}
