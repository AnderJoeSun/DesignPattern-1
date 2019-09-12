package com.myj.designpattern.DesignPattern.state;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class PrizeState extends State {
    public PrizeState(RaffleAvtivity raffleAvtivity) {
        super(raffleAvtivity);
    }

    @Override
    public void deduceMoney() {
        System.out.println("扣过积分了");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在颁奖状态");
        return false;
    }

    @Override
    public void prize() {
        System.out.println("颁奖完毕");
        raffleAvtivity.setCount(raffleAvtivity.getCount() - 1);
        raffleAvtivity.setState(raffleAvtivity.getNoRaffleState());
    }
}
