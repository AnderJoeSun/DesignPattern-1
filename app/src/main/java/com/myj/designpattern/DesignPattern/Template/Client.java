package com.myj.designpattern.DesignPattern.Template;

/**
 * Created by maoyujiao on 2019/8/31.
 */

public class Client {
    public static void main(String[] args){
        SoyaMilk redbeanSoyaMilk = new RedbeanSoyaMilk();
        redbeanSoyaMilk.makeSoyaMilk();

        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.makeSoyaMilk();
    }
}
