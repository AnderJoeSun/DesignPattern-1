package com.myj.designpattern.DesignPattern.state;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class NoRaffleState extends State {

    public NoRaffleState(RaffleAvtivity raffleAvtivity) {
        super(raffleAvtivity);
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经扣了50积分了");
        raffleAvtivity.setState(raffleAvtivity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖，请扣积分");
        return false;
    }

    @Override
    public void prize() {
        System.out.println("还没有抽奖");

    }
}
