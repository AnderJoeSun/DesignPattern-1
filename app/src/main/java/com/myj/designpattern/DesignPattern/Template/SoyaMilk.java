package com.myj.designpattern.DesignPattern.Template;

/**
 * Created by maoyujiao on 2019/8/31.
 *
 * 模板方法模式的钩子方法
 1) 在模板方法模式的父类中，我们可以定义一个方法，它默认不做任何事，
 子类可以 视情况要不要覆盖它，该方法称为“钩子”。
 */

public abstract class SoyaMilk {

    //该方法为模版方法，可定义为final，不能被重写
    public final void makeSoyaMilk(){
        System.out.println("开始制作");
        select();
        if(isAddOther()) {
            addOther();
        }
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

    public boolean isAddOther(){
        return true;
    }
}
