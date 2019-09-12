package com.myj.designpattern.DesignPattern.state;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class PrizeOutState extends State {

    public PrizeOutState(RaffleAvtivity raffleAvtivity) {
        super(raffleAvtivity);
    }

    @Override
    public void deduceMoney() {
        System.out.println("奖品已发完");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品已发完");
        return false;
    }

    @Override
    public void prize() {
        System.out.println("奖品已发完");

    }
}
