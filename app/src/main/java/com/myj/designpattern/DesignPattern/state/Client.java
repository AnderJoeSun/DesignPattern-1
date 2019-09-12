package com.myj.designpattern.DesignPattern.state;

/**
 * Created by maoyujiao on 2019/9/11.
 */

public class Client {
    public static void main(String[] args){
        RaffleAvtivity raffleAvtivity = new RaffleAvtivity(3);
        for(int i = 0;raffleAvtivity.getCount() > 0;i++) {
            raffleAvtivity.deduceMoney();
            if(raffleAvtivity.raffle()){
                raffleAvtivity.prize();
            }
            System.out.println("============");
        }
    }
}
