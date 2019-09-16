package com.myj.designpattern.DesignPattern.memento;

import java.util.Arrays;

/**
 * Created by maoyujiao on 2019/9/5.
 */

public class GameRole {
    private int attack;
    private int defend;

    public GameRole() {

    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public void setStaus(int attack,int defend){
        this.attack = attack;
        this.defend = defend;
    }
}
