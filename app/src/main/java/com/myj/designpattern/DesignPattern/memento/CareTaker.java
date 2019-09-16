package com.myj.designpattern.DesignPattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maoyujiao on 2019/9/16.
 * 存在着保存的历史状态
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
