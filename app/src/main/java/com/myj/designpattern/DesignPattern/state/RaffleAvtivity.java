package com.myj.designpattern.DesignPattern.state;

/**
 * Created by maoyujiao on 2019/9/11.
 *
 */

public class RaffleAvtivity {
    private State state;
    private int count;

    //所有的状态对象，一边获取 RaffleAvtivity和状态是关联关系
    private CanRaffleState canRaffleState = new CanRaffleState(this);
    private NoRaffleState noRaffleState = new NoRaffleState(this);
    private PrizeState prizeState = new PrizeState(this);
    private PrizeOutState prizeOutState = new PrizeOutState(this);


    public RaffleAvtivity(int count) {
        this.state = getNoRaffleState();//初始化状态
        this.count = count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public CanRaffleState getCanRaffleState() {
        return canRaffleState;
    }

    public NoRaffleState getNoRaffleState() {
        return noRaffleState;
    }

    public PrizeState getPrizeState() {
        return prizeState;
    }

    public PrizeOutState getPrizeOutState() {
        return prizeOutState;
    }


    /**
     * 以下是抽奖流程
     */
    public void deduceMoney(){
        state.deduceMoney();
    }

    public boolean raffle(){
        return state.raffle();
    }

    public void prize(){
        state.prize();
    }
}
