package com.myj.designpattern.DesignPattern.Template;

/**
 * Created by maoyujiao on 2019/8/31.
 */

public abstract class SoyaMilk {

    //该方法为模版方法，可定义为final，不能被重写
    public final void makeSoyaMilk(){
        System.out.println("开始制作");
        select();
        addOther();
        soak();
        beat();
        System.out.println("豆浆制作结束");
    }

    public void select(){
        System.out.println("挑选豆子");
    }

    public abstract void addOther();

    public void soak(){
        System.out.println("开始浸泡");
    }

    public void beat(){
        System.out.println("开始打豆浆");
    }
}
