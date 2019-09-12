package com.myj.designpattern.DesignPattern.state;

import java.util.Random;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class CanRaffleState extends State {

    public CanRaffleState(RaffleAvtivity raffleAvtivity) {
        super(raffleAvtivity);
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经扣过积分了");
    }

    @Override
    public boolean raffle() {
        if(raffleAvtivity.getCount() > 0){
            System.out.println("开始抽奖了");
            int random = new Random().nextInt(10);
            if(random == 0){
                System.out.println("抽中奖品了");
                raffleAvtivity.setState(raffleAvtivity.getPrizeState());
                return true;
            } else {
                System.out.println("很遗憾，未中奖");
                raffleAvtivity.setState(raffleAvtivity.getNoRaffleState());
                return false;
            }
        } else {
            raffleAvtivity.setState(raffleAvtivity.getPrizeOutState());
            return false;
        }
    }

    @Override
    public void prize() {
        System.out.println("请先抽奖");
    }
}
