package com.myj.designpattern.DesignPattern.state;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public abstract class State {
    public RaffleAvtivity raffleAvtivity;

    public State(RaffleAvtivity raffleAvtivity) {
        this.raffleAvtivity = raffleAvtivity;
    }

    public abstract void deduceMoney();
    //是否抽中奖品
    public abstract boolean raffle();
    public abstract void prize();
}
