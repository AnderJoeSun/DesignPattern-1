package com.myj.designpattern.DesignPattern.Order;

/**
 * Created by maoyujiao on 2019/9/1.
 * NoCommand类：空命令，不实现任何操作，但可以简化操作，不用判空
 */

public class RemoteControl {
    private Command[] onCommand;
    private Command[] offCommand;
    private Command currentOrder;


    public RemoteControl() {
        onCommand = new Command[5];
        offCommand = new Command[5];
        for(int i = 0 ;i < 5 ;i++){
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }
    }

    public void setCommand(int number,Command on,Command off){
        onCommand[number] = on;
        offCommand[number] = off;
    }

    public void onCommandPush(int number){
        onCommand[number].exacute();
        currentOrder = onCommand[number];
    }

    public void offCommandPush(int number){
        offCommand[number].exacute();
        currentOrder = offCommand[number];
    }

    public void undo(){
        currentOrder.undo();
    }





}
