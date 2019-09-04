package com.myj.designpattern.DesignPattern.mediator;

import java.util.HashMap;

/**
 * Created by maoyujiao on 2019/9/4.
 */

public class ConcreteMediator implements Mediator {

    private HashMap<String,Colleague> colleagueMap;
    private HashMap<String,String> interMap ;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    public void registColleague(String key,Colleague colleague) {
        colleagueMap.put(key,colleague);
        if(colleague instanceof Alarm){
            interMap.put("Alarm",key);
        } else if(colleague instanceof CoffeMachine){
            interMap.put("CoffeeMachine",key);
        }else if(colleague instanceof TV){
            interMap.put("TV",key);
        }else if(colleague instanceof Curtain){
            interMap.put("curtain",key);
        }
    }


    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if(colleagueMap.get(colleagueName) instanceof Alarm){
            if(stateChange == 0){
                ((CoffeMachine)colleagueMap.get(interMap.get("CoffeeMachine"))).start();
                ((TV)colleagueMap.get(interMap.get("TV"))).start();
            } else if(stateChange == 1){
                ((TV)colleagueMap.get(interMap.get("TV"))).close();
            }
        } else if(colleagueMap.get(colleagueName) instanceof CoffeMachine){
            if(stateChange == 0){
                ((Curtain)colleagueMap.get(interMap.get("curtain"))).open();
            }
        } else if(colleagueMap.get(colleagueName) instanceof TV){

        } else if(colleagueMap.get(colleagueName) instanceof Curtain){

        }
    }
}
